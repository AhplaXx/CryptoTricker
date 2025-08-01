plugins {
    alias(libs.plugins.necdet.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.necdet.android.hilt)
    alias(libs.plugins.necdet.android.common)
    alias(libs.plugins.necdet.android.library.compose)

}

android {
    namespace = "com.necdetzr.home.component"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)

}