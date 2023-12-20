rootProject.name = "allure-sandbox"

plugins {
        kotlin("jvm") version "1.9.21" apply false
}

include(
        ":menu", ":ingredients", ":commons")
