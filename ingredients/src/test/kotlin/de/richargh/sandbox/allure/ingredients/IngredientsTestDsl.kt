package de.richargh.sandbox.allure.ingredients

import io.qameta.allure.Allure
import io.qameta.allure.Allure.step

class IngredientsTestDsl {

    private val ingredients = mutableListOf<Ingredient>()

    fun addSpice(spice: Spice){
        step("Adding Spice: ${spice.name}")
        ingredients += spice
    }

    fun testPot() = Pot(ingredients)

}