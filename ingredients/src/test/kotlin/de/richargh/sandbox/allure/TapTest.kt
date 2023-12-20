package de.richargh.sandbox.allure

import io.qameta.allure.Allure.step
import io.qameta.allure.Step
import kotlin.test.Test

class TapTest {

    @Test
    fun `tap with lambda taps`() {
        step("tap 1") { _ ->
            step("tap 1.1")
            step("tap 1.2") { _ ->

            }
        }
        step("tap 2") { _ ->
        }
    }

    @Test
    fun `test with annotation taps`() {
        tap1()
        tap2()
    }

    @Step("tap 1")
    fun tap1() {
        tap11()
        tap12()
    }

    @Step("tap 1.1")
    fun tap11() {
    }

    @Step("tap 1.2")
    fun tap12() {
    }

    @Step("tap 2")
    fun tap2() {
    }
}