
Disaster Response & Prediction System - Project Prototype (College Submission)

This prototype contains:
1. A Flask-based Backend (Python):
   - Handles disaster data reports.
   - Predicts risk levels based on historical JSON data.
   - Exports prediction results to an Excel file.
   - Sends data to the mobile app.

2. A Frontend Web App (HTML, CSS, JS):
   - Users can select a region and month.
   - Displays predicted risk level (Low, Medium, High).
   - Uses background image and click sound for UI experience.

HOW TO RUN:

1. Backend (Python):
   - Make sure Python is installed.
   - Install dependencies: `pip install flask openpyxl`
   - Run the backend: `python app.py`
   - Ensure the `disastermanagementprototype.json` file is present.

2. Frontend (HTML):
   - Open `predict.html` in your browser.
   - The backend must be running locally at `http://localhost:5000`.

3. Android App:
   - Open the Android project in Android Studio (API 21+).
   - Make sure the app points to the same local network address as backend.
   - Run the app on an emulator or real device.

FILES INCLUDED:
- Disaster_Backend.zip: Flask app and data files.
- Disaster_Frontend.zip: UI files with image and sound assets.
- Android project (shared separately).

Note:
- This is a working prototype built for a college project.
- Built by a beginner with learning focus — no Firebase, no external APIs.
