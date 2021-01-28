plugins {
    id("com.android.application")
}

android {
    compileSdkVersion(Versions.compileSdk)
    buildToolsVersion(Versions.buildToolsVersion)

    defaultConfig {
        applicationId = Versions.applicationId
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = Versions.versionCode
        versionName = Versions.versionName

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility =JavaVersion.VERSION_1_8
        targetCompatibility =JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(Libs.appCompat)
    implementation(Libs.material)
    implementation(Libs.constraintLayout)
    testImplementation(Libs.junit)
    androidTestImplementation(Libs.androidxJunit)
    androidTestImplementation(Libs.espressoCore)
}