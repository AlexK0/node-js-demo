rootProject.name = "node-js-demo"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

include("test-module-2")
include("test-module-1")
include("node-js-main")
