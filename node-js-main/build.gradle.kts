plugins {
    kotlin("js")
}

kotlin {
    js(IR) {
        binaries.executable()
        nodejs {
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.6.3")

    implementation(project(":test-module-1"))
}
