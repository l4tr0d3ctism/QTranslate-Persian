dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)

    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        // Google Maven mirror (dl.google.com may be unreachable in some regions)
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        google()
        maven("https://jitpack.io")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
        maven("https://central.sonatype.com/repository/maven-snapshots/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "qtranslate-app"

include("api")

include("core")
include("ui-swing")

include("app")

include("plugins:common")
include("plugins:google-services")
include("plugins:bing-services")
include("plugins:ai-services")