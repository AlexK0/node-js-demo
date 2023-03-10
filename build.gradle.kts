plugins {
    kotlin("multiplatform") version "1.9.255-SNAPSHOT" apply false
    kotlin("plugin.serialization") version "1.9.255-SNAPSHOT" apply false
}

allprojects {
    version = "0.1.1"

    repositories {
        mavenLocal()
        mavenCentral()
    }
}
