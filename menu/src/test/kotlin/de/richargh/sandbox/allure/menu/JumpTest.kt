package de.richargh.sandbox.allure.menu

import io.qameta.allure.Allure.step
import io.qameta.allure.Step
import kotlin.test.Test

class JumpTest {

    @Test
    fun `test with lambda jumps`() {
        step("jump 1") { _ ->
            step("jump 1.1")
            step("jump 1.2") { _ ->

            }
        }
        step("jump 2") { _ ->
        }
    }

    @Test
    fun `test with annotation jumps`() {
        jump1()
        jump2()
    }

    @Step("jump 1")
    fun jump1() {
        jump11()
        jump12()
    }

    @Step("jump 1.1")
    fun jump11() {
    }

    @Step("jump 1.2")
    fun jump12() {
    }

    @Step("jump 2")
    fun jump2() {
    }
}