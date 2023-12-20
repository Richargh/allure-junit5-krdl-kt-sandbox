package de.richargh.sandbox.allure.ingredients

import io.qameta.allure.*
import io.qameta.allure.SeverityLevel.*
import kotlin.test.Test
import kotlin.test.assertEquals

class PotTest: UnitTest() {

    @Epic("Pepper")
    @Feature("Add Pepper")
    @Story("We believe that giving cooks the ability to add pepper will improve food")
    @Test
    fun `food with only Pepper has too much Pepper`() {
        // given
        dsl.addSpice(Spice.Pepper)
        // when
        val result = dsl.testPot().cook()
        // then
        assertEquals(listOf(Critique.TooMuchPepper), result.critiques)
    }

    @Epic("Salt")
    @Feature("Add Salt")
    @Story("We believe that giving cooks the ability to add salt will improve food")
    @Severity(BLOCKER)
    @Test
    fun `food with only Salt has too much Salt`() {
        // given
        dsl.addSpice(Spice.Salt)
        // when
        val result = dsl.testPot().cook()
        // then
        assertEquals(listOf(Critique.TooMuchSalt), result.critiques)
    }

}