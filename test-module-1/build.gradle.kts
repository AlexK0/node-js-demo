plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
}

kotlin {
    js(IR) {
        browser {
        }
        nodejs {
        }
        binaries.executable()
    }
}

dependencies {
   // implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
   // implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.6.3")
}
