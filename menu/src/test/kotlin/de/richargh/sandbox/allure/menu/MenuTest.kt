package de.richargh.sandbox.allure.menu

import de.richargh.sandbox.allure.ingredients.UndefinedFood
import io.qameta.allure.*
import io.qameta.allure.Allure.*
import io.qameta.allure.util.ResultsUtils
import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class MenuTest: UnitTest() {

    @Epic("Menu")
    @Feature("Undefinable food")
    @Story("We believe that giving chefs the ability to add undefinable food should not be implemented but they want it anyway")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    fun `a dish with an undefinable food is not good`() {
        label(ResultsUtils.PARENT_SUITE_LABEL_NAME, "Tests for domain interface")
        label(ResultsUtils.SUB_SUITE_LABEL_NAME, "Tests for bad chefs")
        // given
        dsl.addFood(UndefinedFood(emptyList()), 1)
        // when
        val result = dsl.testKitchen().compose()
        // then
        assertThat(result.critiques).containsExactly(StrongCritique.UndefinableAndNotGood)
    }

    @Epic("Menu")
    @Feature("Undefinable food")
    @Story("We believe that giving chefs the ability to add undefinable food should not be implemented but they want it anyway")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    fun `a dish with many undefinable food is not good as well`() {
        label(ResultsUtils.PARENT_SUITE_LABEL_NAME, "Tests for domain interface")
        label(ResultsUtils.SUB_SUITE_LABEL_NAME, "Tests for bad chefs")
        // given
        dsl.addFood(UndefinedFood(emptyList()), 1)
        dsl.addFood(UndefinedFood(emptyList()), 1)
        dsl.addFood(UndefinedFood(emptyList()), 1)
        // when
        val result = dsl.testKitchen().compose()
        // then
        assertThat(result.critiques).containsExactly(StrongCritique.UndefinableAndNotGood)
    }

}