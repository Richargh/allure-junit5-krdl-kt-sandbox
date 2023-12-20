package de.richargh.sandbox.allure.ingredients

import de.richargh.SealedEnum

sealed class Critique: SealedEnum() {
    data object TooMuchPepper: Critique()
    data object TooMuchSalt: Critique()
}
