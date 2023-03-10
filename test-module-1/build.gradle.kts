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
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(project(":test-module-2"))
            }
        }
    }
}

tasks.withType<Kotlin2JsCompile> {
    kotlinOptions.languageVersion = "2.0"
}
