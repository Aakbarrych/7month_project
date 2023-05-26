object Versions {
    const val AGP = "7.3.1"
    const val kotlin = "1.7.20"
    const val hilt = "2.44.2"
    const val room = "2.5.1"
    const val lifecycle = "2.6.1"
    const val fragment = "1.5.7"
    const val core = "1.7.0"
    const val appcompat = "1.6.1"
    const val material = "1.8.0"
    const val constraint = "2.1.4"
    const val junit = "4.13.2"
    const val extJunit = "1.1.5"
    const val espresso = "3.5.1"
}

object Deps {
    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.room}"
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
        const val ktx = "androidx.room:room-ktx:${Versions.room}"
    }

    object DaggerHilt {
        const val android = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val core = "com.google.dagger:hilt-core:${Versions.hilt}"
        const val compiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object Coroutines {
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
    }

    object Lifecycle {
        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    }

    object Fragment {
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    }

    object UI {
        const val core = "androidx.core:core-ktx${Versions.core}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
        const val junit = "junit:junit:${Versions.junit}"
        const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }
}

object Plugins {
    object AGP {
        const val application = "com.android.application"
        const val library = "com.android.library"
    }

    object Kotlin {
        const val android = "org.jetbrains.kotlin.android"
        const val kapt = "kotlin-kapt"
    }

    object DaggerHilt {
        const val hilt = "com.google.dagger.hilt.android"
    }
}

object Android {

}