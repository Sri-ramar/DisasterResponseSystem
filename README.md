
📁 PROJECT TITLE: Centralized Disaster Response & Inventory Management System (Prototype)

🎯 PURPOSE:
A college-level prototype system that uses AI to predict disaster risk based on historical data.
It replaces Firebase and Gemini with a custom backend + AI logic, built for learning and demo purposes.

🎓 SUBMISSION TYPE: Working MVP prototype for academic presentation

🧑‍💻 BUILT BY: [CryptoVerse]

————————————————————————
————————————————————————

1. 📦 /backend/
   - Flask app (Python) with:
     - `/api/disasters`: Fetch disaster data
     - `/api/report`: Submit disaster report
     - `/api/predict`: Predict risk level (region + month)
     - Auto-saves predictions to Excel (.xlsx)

2. 🌐 /frontend/
   - HTML/CSS/JS web UI
   - Input region + month → shows prediction
   - Plays sound + shows futuristic theme
   - Uses your local Flask server (localhost:5000)

3. 🤖 /mobile/
   - Android Studio app (API 21 / Lollipop)
   - Pulls prediction data from backend
   - Can display alerts or charts (based on code)

4. 📊 /data/
   - disastermanagementprototype.json: Dataset used for predictions
   - prediction_results.xlsx: Excel log of predictions (auto-generated)

————————————————————————
🚀 HOW TO RUN THE PROJECT (All Parts)
————————————————————————

✅ 1. BACKEND (Flask + Python)
------------------------------
📍 Location: `/backend/`

a) Open terminal / CMD  
b) Create virtual environment (optional):
   python -m venv venv
   source venv/bin/activate (Linux/Mac) OR venv\Scripts\activate (Windows)

c) Install dependencies:
   pip install -r requirements.txt

d) Run the app:
   python app.py

➡ Now your API runs at: http://localhost:5000

It will save predictions to: `prediction_results.xlsx`

✅ 2. FRONTEND (HTML + JS)
------------------------------
📍 Location: `/frontend/`

a) Open `predict.html` in your browser  
b) Enter a region (e.g., Assam) and select a month  
c) Click "Predict" → you'll hear a sound + see result

➡ It sends request to: `http://localhost:5000/api/predict`

NOTE: Make sure Flask backend is running in background!

✅ 3. ANDROID APP (Mobile)
------------------------------
📍 Location: `/mobile/` or open `DisasterResponseAndroidProject` in Android Studio

a) Use Android Studio to open the project  
b) Set min API level to 21 (Lollipop)  
c) Run on emulator or device  
d) App connects to backend via API

NOTE: You may need to update the IP address in code if you're using emulator (e.g., `10.0.2.2` instead of `localhost`).

✅ 4. MVP HOSTING (Optional)
------------------------------
If you want to deploy this project online:

- Host Backend: use [Render.com] (Python backend)
- Host Frontend: use [GitHub Pages] or [Render.com Static Site]

————————————————————————
📝 NOTES
————————————————————————

- Works fully offline
- Custom-built backend — no Firebase or Gemini
- AI predictions are basic — built using historical frequency
- All reports and predictions save to local JSON + Excel

---- JUST A PROTOTYPE NEXTTIME WE WILL TRY TO BRING ONLINE WITH FIREBASE AND GEMINI ----------
