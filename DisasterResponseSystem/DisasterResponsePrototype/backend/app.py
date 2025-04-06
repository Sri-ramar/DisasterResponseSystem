from flask import Flask, jsonify, request
from flask_cors import CORS
import json
from datetime import datetime

app = Flask(__name__)
CORS(app)

# Load dataset
with open("disastermanagementprototype.json", "r") as f:
    data = json.load(f)

@app.route("/api/disasters", methods=["GET"])
def get_disasters():
    return jsonify(data)

@app.route("/api/report", methods=["POST"])
def report_disaster():
    report = request.json
    data.append(report)
    with open("disastermanagementprototype.json", "w") as f:
        json.dump(data, f, indent=4)
    return jsonify({"message": "Report received!"}), 201

@app.route("/api/predict", methods=["POST"])
def predict_disaster():
    req = request.get_json()
    region = req.get("region")
    month = req.get("month")

    if not region or not month:
        return jsonify({"error": "region and month required"}), 400

    count = 0
    for d in data:
        try:
            date = datetime.strptime(str(d["date"]), "%Y-%m-%d")
            if region.lower() in d["location"].lower() and date.month == int(month):
                count += 1
        except:
            continue

    risk = "Low"
    if count >= 5:
        risk = "High"
    elif count >= 3:
        risk = "Medium"

    return jsonify({
        "region": region,
        "month": month,
        "risk_level": risk,
        "historical_count": count
    })

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000, debug=True)
