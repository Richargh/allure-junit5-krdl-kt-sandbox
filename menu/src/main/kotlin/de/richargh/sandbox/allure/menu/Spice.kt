package de.richargh.sandbox.allure.menu

sealed class Spice(override val name: String): Ingredient {
    data object Salt: Spice("Salt")
    data object Pepper: Spice("Pepper")
}