plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.relay") version "0.3.02"
}

android {
    namespace = "com.bemathandroid"
    compileSdk = 34
/*ourceSets{
    main {
        assets {
            srcDir('src/main/ui-packages')
        }
    }
}*/
    defaultConfig {
        applicationId = "com.bemathandroid"
        minSdk = 27
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    // compose
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("androidx.compose.ui:ui:1.5.2")
    // foundation
    implementation("androidx.compose.foundation:foundation:1.5.2")
    // material
    implementation("androidx.compose.material:material:1.5.2")
    // material3
    implementation("androidx.compose.material3:material3:1.2.0-alpha08")
    // Unresolved reference: tooling
    implementation("androidx.compose.ui:ui-tooling:1.5.2")
}