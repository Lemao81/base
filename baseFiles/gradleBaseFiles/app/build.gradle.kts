plugins {
    id(PluginIds.androidApplication)
    kotlin(PluginIds.android)
    id(PluginIds.kotlinAndroidExtensions)
}

android {
    configureAndroidAppExtension(this)
    minifyRelease(this)
    optimizeBuildTime(project, this)
}

dependencies {
    implementation(Libs.kotlinStd8)
    implementation(Libs.androidxAppcompat)
    implementation(Libs.androidxConstraintLayout)
}