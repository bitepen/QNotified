plugins {
    id("com.android.library")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        minSdkVersion(21)
        vectorDrawables.useSupportLibrary = true
        consumerProguardFiles("proguard-rules.pro")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
}
