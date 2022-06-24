plugins {
    kotlin("multiplatform") version "1.7.0" apply false // 1.7.255-SNAPSHOT
    kotlin("plugin.serialization") version "1.7.0" apply false
}

allprojects {
    version = "0.1.1"

    repositories {
        mavenLocal()
        mavenCentral()
    }
}
