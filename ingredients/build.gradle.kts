plugins {
    kotlin("jvm")
    id("io.qameta.allure") version "2.11.2"
}

val allureVersion = "2.25.0"
val aspectJVersion = "1.9.21"
val kotlinVersion = "1.9.21"
val assertjVersion = "3.24.2"

kotlin {
    jvmToolchain(17)
}

val agent: Configuration by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = true
}

tasks.test {
    ignoreFailures = true
    useJUnitPlatform()
    jvmArgs = listOf(
        "-javaagent:${agent.singleFile}"
    )
}

dependencies {
    agent("org.aspectj:aspectjweaver:$aspectJVersion")

    implementation(project(":commons"))
    
    testImplementation(platform("org.jetbrains.kotlin:kotlin-bom:$kotlinVersion"))
    testImplementation("org.jetbrains.kotlin:kotlin-stdlib")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    testImplementation(platform("io.qameta.allure:allure-bom:$allureVersion"))
    testImplementation("io.qameta.allure:allure-junit5")

    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.assertj:assertj-core:$assertjVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    testImplementation("org.slf4j:slf4j-simple:2.0.9")
}

repositories {
    mavenCentral()
}
