plugins {
    id(PluginIds.androidLibrary)
    kotlin(PluginIds.android)
    kotlin(PluginIds.kapt)
}

android {
    configureAndroidLibraryExtension(this)
    minifyRelease(this)
}

dependencies {
    implementation(Libs.kotlinStd8)
}