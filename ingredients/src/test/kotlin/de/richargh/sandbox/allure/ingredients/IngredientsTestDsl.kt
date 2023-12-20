package de.richargh.sandbox.allure.ingredients

import io.qameta.allure.Allure
import io.qameta.allure.Allure.step

class IngredientsTestDsl {

    private val ingredients = mutableListOf<Ingredient>()

    fun addSpice(spice: Spice, gram: Int){
        step("Adding ${gram}g of ${spice.name}")
        ingredients += spice
    }

    fun testPot() = Pot(ingredients)

}