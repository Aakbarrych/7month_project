plugins {
    id(Plugins.AGP.application)
    id(Plugins.Kotlin.android)
    id(Plugins.Kotlin.kapt)
    id(Plugins.DaggerHilt.hilt)
}

android {
    namespace = AppConfig.namespace
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = AppConfig.compatibility
        targetCompatibility = AppConfig.compatibility
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    //UI
    implementation(Deps.UI.core)
    implementation(Deps.UI.appcompat)
    implementation(Deps.UI.material)
    implementation(Deps.UI.constraint)
    testImplementation(Deps.UI.junit)
    androidTestImplementation(Deps.UI.extJunit)
    androidTestImplementation(Deps.UI.espresso)

    // Room
    implementation(Deps.Room.runtime)
    kapt(Deps.Room.compiler)
    implementation(Deps.Room.ktx)

    // Coroutines
    implementation(Deps.Coroutines.android)

    // Hilt
    implementation(Deps.DaggerHilt.android)
    implementation(Deps.DaggerHilt.core)
    kapt((Deps.DaggerHilt.compiler))

    // Lifecycle
    implementation(Deps.Lifecycle.viewmodel)
    implementation(Deps.Lifecycle.runtime)

    //Fragment
    implementation(Deps.Fragment.fragment)

}