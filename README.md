# My Application - Android MVVM & Firebase Showcase

A modern, high-performance Android application demonstrating clean architecture principles, RESTful API integration, and real-time database synchronization using Jetpack Compose and the MVVM (Model-View-ViewModel) pattern.

## 🌟 Features

### 📡 REST API Integration (Home)
- **Dynamic Content:** Fetches real-time data from the [JSONPlaceholder](https://jsonplaceholder.typicode.com/) API.
- **Efficient Networking:** Implements **Retrofit 2** with asynchronous Coroutine support for non-blocking UI.
- **Error Handling:** Robust handling of loading states and network exceptions with user-friendly feedback.

### ✍️ Firebase Data Management (Profile)
- **Content Creation:** Interactive form to upload custom items to the cloud.
- **Cloud Persistence:** Securely stores data in **Firebase Realtime Database**.
- **Metadata Support:** Allows users to flag items as "Favorites" directly at the source.

### ⚡ Real-time Synchronization (Favorites)
- **Live Updates:** Automatically reflects database changes without manual refreshing.
- **Optimized Queries:** Uses server-side filtering to observe only items where `favorite == true`.
- **Reactive Streams:** Leverages Kotlin **Flow** and `callbackFlow` to bridge Firebase listeners with Compose UI.

## 🛠 Technical Stack

- **UI:** Jetpack Compose (Declarative UI)
- **Navigation:** Material 3 Navigation Suite (Adaptive for different screen sizes)
- **Concurrency:** Kotlin Coroutines & StateFlow
- **Networking:** Retrofit 2 & GSON
- **Database:** Firebase Realtime Database
- **Architecture:** Clean MVVM with Repository Pattern
- **Dependency Management:** Gradle Version Catalog (`libs.versions.toml`)

## 🏗 Project Architecture

The codebase is organized into feature-based packages to promote scalability and maintainability:

- **`com.example.myapplication.posts`**: Handles API communication, post models, and the main feed UI.
- **`com.example.myapplication.profile`**: Manages the data entry logic and Firebase upload operations.
- **`com.example.myapplication.favorites`**: Implements real-time observation and display of filtered data.
- **`com.example.myapplication.data`**: Contains the `FirebaseRepository` which abstracts database complexity.
- **`com.example.myapplication.Retrofit`**: Centralized configuration for network services.

## 🚀 Getting Started

To run this project locally, ensure you have the following:

1.  **Firebase Setup:** 
    - Create a project in the [Firebase Console](https://console.firebase.google.com/).
    - Add an Android app with the package name `com.example.myapplication`.
    - Download the `google-services.json` file and place it in the `app/` directory.
2.  **Database Rules:** 
    - Enable Realtime Database and ensure rules allow read/write access (for development).
3.  **Build:** 
    - Sync the project with Gradle files in Android Studio.
    - Run the application on an emulator or physical device (Min SDK: 24).

## 📊 Technical Highlights

- **Reactive UI:** The UI reacts to state changes exposed via `StateFlow`, ensuring a "Single Source of Truth".
- **Adaptive Design:** Utilizes `NavigationSuiteScaffold` to provide a consistent navigation experience across different device form factors.
- **Clean Imports:** Strict package separation ensures that the UI layer remains decoupled from business logic and data sources.
