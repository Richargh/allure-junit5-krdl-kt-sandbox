plugins {
    id("io.qameta.allure-aggregate-report") version "2.11.2"
}

repositories {
    mavenCentral()
}

tasks.withType(Wrapper::class) {
    gradleVersion = "8.5"
}