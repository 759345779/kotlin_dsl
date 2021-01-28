object Versions{
    const val compileSdk = 30
    const val buildToolsVersion="30.0.3"
    const val minSdk = 27
    const val targetSdk = 29

    const val applicationId = "com.example.kotlindslt"
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val appCompat = "1.2.0"
    const val material = "1.2.1"
    const val constraintLayout = "2.0.4"
    const val junit = "4.0"
    const val androidxJunit = "1.1.2"
    const val espressoCore = "3.3.0"

}

object Libs{
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val junit = "junit:junit:${Versions.junit}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.androidxJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"

}