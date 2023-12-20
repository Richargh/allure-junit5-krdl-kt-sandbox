package de.richargh.sandbox.allure.menu

import de.richargh.sandbox.allure.ingredients.Food
import io.qameta.allure.Allure.step

class MenuTestDsl {

    private val foods = mutableListOf<Food>()

    fun addFood(food: Food, amount: Int){
        step("Adding $amount of ${food.name}")
        foods += food
    }

    fun testKitchen() = Kitchen(foods)

}