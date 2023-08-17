plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = Android.namespace
    compileSdk = Android.compileSdk
    defaultConfig {
        applicationId = Android.applicationId
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk
        versionCode = Android.versionCode
        versionName = Android.versionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeComplier
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))
//    implementation(Accompanist.SystemUiController)

    implementation(Androidx.core)
    implementation(Androidx.lifecycleRuntime)

    // CORE
    implementation(Compose.ui)
    implementation(Compose.material)
    implementation(Compose.toolingPreview)
    implementation(Compose.foundation)
    implementation(Compose.activity)
    implementation(Compose.layout)
    implementation(Compose.themeAdapter)
    implementation(Compose.runtime)
    implementation(Compose.materialIconsExtended)
//    implementation(Compose.shimmer)
//    implementation(Compose.lottie)
//    implementation(Compose.navigation)
//    implementation(Compose.viewModelCompose)

    // LOKALISE
//    implementation(Translation.lokaliseSdk)

    // ADOBE
//    implementation(Adobe.core)
//    implementation(Adobe.analytics)
//    implementation(Adobe.sdkCore)

    // TESTING
    testImplementation(Test.junit)
    androidTestImplementation(TestUi.extJunit)
//    androidTestImplementation(Test.instrumentedTestCompose)

    // DEBUGGING
    debugImplementation(Compose.tooling)
}