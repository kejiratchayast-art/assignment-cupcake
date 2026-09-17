package com.example.cupcake.test

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.cupcake.R
import com.example.cupcake.ui.SelectOptionScreen
import org.junit.Rule
import org.junit.Test

class CupcakeOrderScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun selectOptionScreen_verifyContent() {
        // Given list of options
        val flavors = listOf("Vanilla", "Chocolate", "Strawberry", "Red Velvet", "Matcha", "Lemon")
        val subtotal = "$10.00"

        // When the SelectOptionScreen is loaded
        composeTestRule.setContent {
            SelectOptionScreen(
                subtotal = subtotal,
                options = flavors,
                onNextButtonClicked = {},
                onCancelButtonClicked = {}
            )
        }

        // Then verify the flavor options and elements exist on screen
        flavors.forEach { flavor ->
            composeTestRule.onNodeWithText(flavor).assertExists()
        }

        // Verify subtotal displays properly
        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(R.string.subtotal_price, subtotal)
        ).assertExists()

        // Verify that the 'Next' button is disabled by default before choosing an option
        composeTestRule.onNodeWithStringId(R.string.next).assertIsNotEnabled()
    }
}
