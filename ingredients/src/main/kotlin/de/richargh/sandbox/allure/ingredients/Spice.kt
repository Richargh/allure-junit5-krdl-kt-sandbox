package de.richargh.sandbox.allure.ingredients

sealed class Spice(override val name: String): Ingredient {
    data object Salt: Spice("Salt")
    data object Pepper: Spice("Pepper")
}