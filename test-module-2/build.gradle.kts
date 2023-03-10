import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    kotlin("multiplatform")
}

kotlin {
    js(IR) {
        useCommonJs()
        browser {
        }
        nodejs {
        }
    }
}

tasks.withType<Kotlin2JsCompile> {
    kotlinOptions.languageVersion = "2.0"
}
