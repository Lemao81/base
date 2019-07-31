plugins {
    id(PluginIds.androidLibrary)
    kotlin(PluginIds.android)
    kotlin(PluginIds.kapt)
}

android {
    configureAndroidExtension(this)

    buildTypes {
        getByName(BuildTypes.release) {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Libs.kotlinStd8)
}