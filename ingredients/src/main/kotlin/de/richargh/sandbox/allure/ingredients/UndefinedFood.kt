package de.richargh.sandbox.allure.ingredients

data class UndefinedFood(
    override val critiques: List<RoughCritique>) : Food {

    override val name: String = "Undefined"
}
