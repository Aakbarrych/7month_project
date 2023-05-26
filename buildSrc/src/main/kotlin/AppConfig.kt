import org.gradle.api.JavaVersion

object AppConfig {
    const val compileSdk = 33
    const val minSdk = 24
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val namespace = "com.example.a7month_project"
    const val applicationId = "com.example.a7month_project"
    const val jvmTarget = "1.8"
    val compatibility = JavaVersion.VERSION_1_8
}