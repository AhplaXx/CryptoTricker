// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.10.1" apply false
    id("com.android.library") version "8.10.1" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.1.0" apply false
    id("com.google.firebase.crashlytics") version "3.0.4" apply false
    id("org.jetbrains.kotlin.android") version "2.1.0" apply false
    id("com.google.devtools.ksp") version "2.1.0-1.0.29"
    id("com.google.dagger.hilt.android") version "2.48" apply false    // Downgraded for compatibility
    id("com.google.gms.google-services") version "4.4.2" apply false
}