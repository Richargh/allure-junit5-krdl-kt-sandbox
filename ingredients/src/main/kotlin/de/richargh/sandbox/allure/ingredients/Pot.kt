package de.richargh.sandbox.allure.ingredients

class Pot(val ingredients: List<Ingredient>) {
    fun cook(): Food {

        val critiques = mutableListOf<RoughCritique>()
        if(ingredients.contains(Spice.Pepper) && ingredients.size == 1){
            critiques += RoughCritique.TooMuchPepper
        }
        if(ingredients.contains(Spice.Salt) && ingredients.size == 1){
            critiques += RoughCritique.TooMuchSalt
        }

        return UndefinedFood(critiques)
    }
}