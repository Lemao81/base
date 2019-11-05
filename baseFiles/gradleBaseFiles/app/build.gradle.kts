plugins {
    id(PluginIds.androidApplication)
    kotlin(PluginIds.android)
    id(PluginIds.kotlinAndroidExtensions)
}

android {
    configureAndroidAppExtension()
    minifyRelease()
    optimizeBuildTime(project)
}

dependencies {
    implementation(Libs.kotlinStd8)
    implementation(Libs.androidxAppcompat)
    implementation(Libs.androidxConstraintLayout)
    implementation(Libs.ankoCommons)
}