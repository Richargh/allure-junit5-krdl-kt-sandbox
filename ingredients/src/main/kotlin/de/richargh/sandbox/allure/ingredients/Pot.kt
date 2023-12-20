package de.richargh.sandbox.allure.ingredients

class Pot(val ingredients: List<Ingredient>) {
    fun cook(): Food {

        val critiques = mutableListOf<Critique>()
        if(ingredients.contains(Spice.Pepper) && ingredients.size == 1){
            critiques += Critique.TooMuchPepper
        }
        if(ingredients.contains(Spice.Salt) && ingredients.size == 1){
            critiques += Critique.TooMuchSalt
        }

        return Food(critiques)
    }
}