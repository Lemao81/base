object Versions {
    const val compileSdkVersion = 27
    const val minSdkVersion = 19
    const val targetSdkVersion = 27
    const val versionCode = 1
    const val versionName = "1.0"

    const val customPlugins = "1.0.2"
    const val gmsPlugin = "3.1.0"
    const val gradlePlugin = "3.1.1"
    const val fabricPlugin = "1.24.4"
    const val hugoPlugin = "1.2.1"
    
    const val andutils = "1.0.15"
    const val jutils = "1.0.1"
    const val firebaseutils = "1.0.1"
    const val resutils = "1.0.1"
    const val rangebar = "1.0.1"

    const val java7 = "1.7"
    const val java8 = "1.8"
    const val kotlin = "1.2.30"
    const val kotlinCoroutine = "0.21"
    const val anko = "0.10.3"
    const val gms = "11.8.0"
    const val firebase = "11.8.0"
    const val support = "27.1.1"
    const val androidPlugin = "3.1.0"
    const val glide = "4.5.0"
    const val rxJava = "2.1.9"
    const val rxJavaAndroid = "2.0.1"
    const val mapStruct = "1.2.0.Final"
    const val constraintLayout = "1.0.2"
    const val firebaseUi = "3.2.2"
    const val mosbyMvi = "3.1.0"
    const val rxBinding = "2.1.0"
    const val dagger = "2.15"
    const val joda = "2.9.9"
    const val crystalRange = "1.1.3"
    const val imageCropper = "2.5.1"
    const val imageCompressor = "2.1.0"
    const val circleIndicator = "1.2.2@aar"
    const val circleImageView = "2.2.0"
    const val keyboardVisibility = "2.1.0"
    const val jUnit = "4.12"
    const val supportTest = "1.0.1"
    const val espresso = "3.0.1"
    const val crashLytics = "2.7.1@aar"
    const val apacheValidator = "1.6"
    const val javaxInject = "1"
    const val koin = "0.9.2"
    const val room = "1.0.0"
    const val mockito = "2.7.22"
    const val powermock = "1.6.5"
    const val androidKtx = "0.3"
    const val frodo = "0.8.3"
    const val retrofit2 = "2.4.0"
    const val retrofit2CoroutineAdapter = "1.0.0"
    const val buildTimeTracker = "0.11.0"
    const val archLifecycle = "1.1.1"
    const val okLog = "2.3.0"
}

object Libs {
    const val andutils = "com.jueggs:andutils:${Versions.andutils}"
    const val jutils = "com.jueggs:jutils:${Versions.jutils}"
    const val firebaseutils = "com.jueggs:firebaseutils:${Versions.firebaseutils}"
    const val resutils = "com.jueggs:resutils:${Versions.resutils}"
    const val rangebar = "com.jueggs.customview:rangebar:${Versions.rangebar}"
    
    const val kotlinStd7 = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
    const val kotlinStd8 = "org.jetbrains.kotlin:kotlin-stdlib-jre8:${Versions.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val kotlinCoroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutine}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxJavaAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxJavaAndroid}"
    const val rxBinding = "com.jakewharton.rxbinding2:rxbinding-kotlin:${Versions.rxBinding}"
    const val rxBindingRecyclerView = "com.jakewharton.rxbinding2:rxbinding-recyclerview-v7-kotlin:${Versions.rxBinding}"
    const val appcompat = "com.android.support:appcompat-v7:${Versions.support}"
    const val design = "com.android.support:design:${Versions.support}"
    const val recyclerView = "com.android.support:recyclerview-v7:${Versions.support}"
    const val cardView = "com.android.support:cardview-v7:${Versions.support}"
    const val supportV4 = "com.android.support:support-v4:${Versions.support}"
    const val supportAnnotations = "com.android.support:support-annotations:${Versions.support}"
    const val exifinterface = "com.android.support:exifinterface:${Versions.support}"
    const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
    const val gridLayout = "com.android.support:gridlayout-v7:${Versions.support}"
    // must equal gradle plugin version
    const val databindingCompiler = "com.android.databinding:compiler:${Versions.gradlePlugin}"
    const val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebase}"
    const val firebaseDatabase = "com.google.firebase:firebase-database:${Versions.firebase}"
    const val firebaseAuth = "com.google.firebase:firebase-auth:${Versions.firebase}"
    const val firebaseCrash = "com.google.firebase:firebase-crash:${Versions.firebase}"
    const val firebaseStorage = "com.google.firebase:firebase-storage:${Versions.firebase}"
    const val firebaseUi = "com.firebaseui:firebase-ui-database:${Versions.firebaseUi}"
    const val gmsBase = "com.google.android.gms:play-services-base:${Versions.gms}"
    const val gmsLocation = "com.google.android.gms:play-services-location:${Versions.gms}"
    const val mosbyMvi = "com.hannesdorfmann.mosby3:mvi:${Versions.mosbyMvi}"
    const val anko = "org.jetbrains.anko:anko:${Versions.anko}"
    const val ankoDesign = "org.jetbrains.anko:anko-design:${Versions.anko}"
    const val ankoCommons = "org.jetbrains.anko:anko-commons:${Versions.anko}"
    const val dagger = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val daggerSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val daggerProc = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val joda = "joda-time:joda-time:${Versions.joda}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val crystalRange = "com.crystal:crystalrangeseekbar:${Versions.crystalRange}"
    const val imageCropper = "com.theartofdev.edmodo:android-image-cropper:${Versions.imageCropper}"
    const val imageCompressor = "id.zelory:compressor:${Versions.imageCompressor}"
    const val circleIndicator = "me.relex:circleindicator:${Versions.circleIndicator}"
    const val circleImageView = "de.hdodenhof:circleimageview:${Versions.circleImageView}"
    const val keyboardVisibility = "net.yslibrary.keyboardvisibilityevent:keyboardvisibilityevent:${Versions.keyboardVisibility}"
    const val mapStruct = "org.mapstruct:mapstruct-jdk8:${Versions.mapStruct}"
    const val mapStructProc = "org.mapstruct:mapstruct-processor:${Versions.mapStruct}"
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val testRunner = "com.android.support.test:runner:${Versions.supportTest}"
    const val testRules = "com.android.support.test:rules:${Versions.supportTest}"
    const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    const val espressoIntents = "com.android.support.test.espresso:espresso-intents:${Versions.espresso}"
    const val crashLytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashLytics}"
    const val apacheValidator = "commons-validator:commons-validator:${Versions.apacheValidator}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val javaxInject = "javax.inject:javax.inject:${Versions.javaxInject}"
    const val koin = "org.koin:koin-android:${Versions.koin}"
    const val koinAndroid = "org.koin:koin-android:${Versions.koin}"
    const val koinAndroidArchitecture = "org.koin:koin-android-architecture:${Versions.koin}"
    const val roomRuntime = "android.arch.persistence.room:runtime:${Versions.room}"
    const val roomCompiler = "android.arch.persistence.room:compiler:${Versions.room}"
    const val roomRxJava = "android.arch.persistence.room:rxjava2:${Versions.room}"
    const val archLifecycle = "android.arch.lifecycle:extensions:${Versions.archLifecycle}"
    const val archLifecycleCompiler = "android.arch.lifecycle:compiler:${Versions.archLifecycle}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val powermock = "org.powermock:powermock:${Versions.powermock}"
    const val androidKtx = "androidx.core:core-ktx:${Versions.androidKtx}"
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit2}"
    const val retrofit2GsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit2}"
    const val retrofit2CoroutineAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:${Versions.retrofit2CoroutineAdapter}"
    const val okLog = "com.github.simonpercic:oklog3:${Versions.okLog}"
}

object Plugins {
    const val custom = "com.jueggs:gradleplugins:${Versions.customPlugins}"
    const val gradle = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val gms = "com.google.gms:google-services:${Versions.gmsPlugin}"
    const val fabric = "io.fabric.tools:gradle:${Versions.fabricPlugin}"
    const val hugo = "com.jakewharton.hugo:hugo-plugin:${Versions.hugoPlugin}"
    const val frodo = "com.fernandocejas.frodo:frodo-plugin:${Versions.frodo}"
    const val buildTimeTracker = "net.rdrei.android.buildtimetracker:gradle-plugin:${Versions.buildTimeTracker}"
}

object Urls {
    const val mavenLocalSnapshot = "http://localhost:8080/repository/snapshots"
    const val mavenLocalInternal = "http://localhost:8080/repository/internal"
    const val fabric = "https://maven.fabric.io/public"
    const val jitpack = "https://jitpack.io"
    const val maven = "https://maven.google.com/"
}
