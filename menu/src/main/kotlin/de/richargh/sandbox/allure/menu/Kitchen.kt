package de.richargh.sandbox.allure.menu

import de.richargh.sandbox.allure.ingredients.Food
import de.richargh.sandbox.allure.ingredients.UndefinedFood

class Kitchen(val foods: List<Food>) {
    fun compose(): Dish {
        val critiques = mutableListOf<StrongCritique>()
        if(foods.any { it is UndefinedFood }){
            critiques += StrongCritique.UndefinableAndNotGood
        }
        return Dish(critiques)
    }
}