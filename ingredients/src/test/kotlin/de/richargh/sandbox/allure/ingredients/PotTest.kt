package de.richargh.sandbox.allure.ingredients

import io.qameta.allure.*
import io.qameta.allure.Allure.*
import io.qameta.allure.SeverityLevel.*
import io.qameta.allure.util.ResultsUtils.PARENT_SUITE_LABEL_NAME
import io.qameta.allure.util.ResultsUtils.SUB_SUITE_LABEL_NAME
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class PotTest: UnitTest() {

    @Epic("Pepper")
    @Feature("Add Pepper")
    @Story("We believe that giving cooks the ability to add pepper will improve food")
    @ParameterizedTest
    @ValueSource(ints = [1, 10, 500, 10000, Integer.MAX_VALUE])
    fun `food with only Pepper has too much Pepper`(@Param("gram") grams: Int) {
        label(PARENT_SUITE_LABEL_NAME, "Tests for domain interface")
        suite("Tests for essential features")
        label(SUB_SUITE_LABEL_NAME, "Tests for basic cooks")
        // given
        dsl.addSpice(Spice.Pepper, grams)
        // when
        val result = dsl.testPot().cook()
        // then
        assertThat(result.critiques).containsExactly(RoughCritique.TooMuchPepper)
    }

    @Epic("Salt")
    @Feature("Add Salt")
    @Story("We believe that giving cooks the ability to add salt will improve food")
    @Severity(BLOCKER)
    @ParameterizedTest
    @ValueSource(ints = [1, 10, 500, 10000, Integer.MAX_VALUE])
    fun `food with only Salt has too much Salt`(@Param("gram") grams: Int) {
        label(PARENT_SUITE_LABEL_NAME, "Tests for domain interface")
        suite("Tests for essential features")
        label(SUB_SUITE_LABEL_NAME, "Tests for good cooks")
        // given
        dsl.addSpice(Spice.Salt, grams)
        // when
        val result = dsl.testPot().cook()
        // then
        assertThat(result.critiques).containsExactly(RoughCritique.TooMuchSalt)
    }

}