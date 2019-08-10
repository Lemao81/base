plugins {
    id(PluginIds.androidApplication)
    kotlin(PluginIds.android)
    id(PluginIds.kotlinAndroidExtensions)
}

android {
    configureAndroidExtension(this)
    defaultConfig.applicationId = App.applicationId
    minifyRelease(this)
    optimizeBuildTime(project, this)

    flavorDimensions(Dimensions.main)
    productFlavors {
        create(Flavors.dev) {
            applicationIdSuffix = ".dev"
            resConfigs("en", "xhdpi")
        }
        create(Flavors.prod) {
            applicationIdSuffix = ".prod"
        }
    }
}

dependencies {
    implementation(Libs.kotlinStd8)
    implementation(Libs.androidxAppcompat)
    implementation(Libs.androidxConstraintLayout)
}