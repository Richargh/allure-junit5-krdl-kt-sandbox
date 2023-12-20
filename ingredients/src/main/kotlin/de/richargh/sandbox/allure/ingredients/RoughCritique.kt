package de.richargh.sandbox.allure.ingredients

import de.richargh.SealedEnum

sealed class RoughCritique: SealedEnum() {
    data object TooMuchPepper: RoughCritique()
    data object TooMuchSalt: RoughCritique()
}
