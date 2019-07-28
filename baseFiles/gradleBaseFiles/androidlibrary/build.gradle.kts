apply(from = Paths.baseMaven)

plugins {
    id(PluginIds.androidLibrary)
    kotlin(PluginIds.android)
    kotlin(PluginIds.kapt)
}

android {
    compileSdkVersion(Android.compileSdkVersion)
    defaultConfig {
        versionCode = App.versionCode
        versionName = App.versionName
        minSdkVersion(Android.minSdkVersion)
        targetSdkVersion(Android.targetSdkVersion)

        multiDexEnabled = true
        testInstrumentationRunner = Const.androidTestRunner
    }

    buildTypes {
        getByName(BuildTypes.release) {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    dexOptions.preDexLibraries = true
    packagingOptions.pickFirst("protobuf.meta")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(Libs.kotlinStd8)
}