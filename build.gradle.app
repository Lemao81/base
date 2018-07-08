apply plugin: 'com.android.application'
apply plugin: 'kotlin-kapt'
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'

android {
    compileSdkVersion Versions.compileSdkVersion
    defaultConfig {
        applicationId "com.jueggs."
        minSdkVersion Versions.minSdkVersion
        targetSdkVersion Versions.targetSdkVersion
        versionCode Versions.versionCode
        versionName Versions.versionName

        multiDexEnabled true
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility = Versions.java8
        targetCompatibility = Versions.java8
    }

    flavorDimensions "main"
    productFlavors {
        dev {
            dimension "main"
            applicationIdSuffix ".dev"
        }
        prod {
            dimension "main"
            applicationIdSuffix ".prod"
        }
    }
}

kotlin { experimental { coroutines "enable" } }
androidExtensions { experimental = true }
kapt { useBuildCache = true }

dependencies {
    implementation project(":domain")
    implementation project(":data")

    implementation Libs.kotlinStd8
    implementation Libs.appcompat
    implementation Libs.constraintLayout
    implementation Libs.koin

    testImplementation Libs.jUnit
    testImplementation Libs.mockito

    androidTestImplementation Libs.testRunner
    androidTestImplementation Libs.testRules
    androidTestImplementation Libs.espressoCore
    androidTestImplementation Libs.mockito
}
