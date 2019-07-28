plugins {
    id(PluginIds.androidApplication)
    id(PluginIds.kotlinAndroidExtensions)
    kotlin(PluginIds.android)
}

android {
    defaultConfig {
        applicationId = App.applicationId
        versionCode = App.versionCode
        versionName = App.versionName
        compileSdkVersion(Android.compileSdkVersion)
        targetSdkVersion(Android.targetSdkVersion)
        minSdkVersion(Android.minSdkVersion)

        javaCompileOptions { annotationProcessorOptions.includeCompileClasspath = true }
        multiDexEnabled = true
        testInstrumentationRunner = Const.androidTestRunner
    }

    buildTypes {
        getByName(BuildTypes.debug) {
            isMinifyEnabled = false
        }

        getByName(BuildTypes.release) {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    dexOptions {
        preDexLibraries = true
    }

    if (project.hasProperty("devBuild")) {
        splits.abi.isEnable = false
        splits.density.isEnable = false
        aaptOptions.cruncherEnabled = false
    }
}

dependencies {
    implementation(Libs.kotlinStd8)
}