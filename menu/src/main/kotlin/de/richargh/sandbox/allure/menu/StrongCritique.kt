package de.richargh.sandbox.allure.menu

import de.richargh.SealedEnum

sealed class StrongCritique: SealedEnum() {
    data object UndefinableAndNotGood: StrongCritique()
}
