package com.example.disasterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val regionInput = findViewById<EditText>(R.id.regionInput)
        val monthInput = findViewById<EditText>(R.id.monthInput)
        val resultText = findViewById<TextView>(R.id.resultText)
        val predictButton = findViewById<Button>(R.id.predictButton)

        predictButton.setOnClickListener {
            val region = regionInput.text.toString()
            val month = monthInput.text.toString()

            val json = JSONObject()
            json.put("region", region)
            json.put("month", month)

            val body = RequestBody.create(MediaType.get("application/json; charset=utf-8"), json.toString())
            val request = Request.Builder()
                .url("http://10.0.2.2:5000/api/predict")
                .post(body)
                .build()

            OkHttpClient().newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    runOnUiThread { resultText.text = "Error: ${e.message}" }
                }

                override fun onResponse(call: Call, response: Response) {
                    response.body()?.let {
                        val resJson = JSONObject(it.string())
                        val result = "Risk in ${resJson.getString("region")} (${resJson.getString("month")}): ${resJson.getString("risk_level")}"
                        runOnUiThread { resultText.text = result }
                    }
                }
            })
        }
    }
}