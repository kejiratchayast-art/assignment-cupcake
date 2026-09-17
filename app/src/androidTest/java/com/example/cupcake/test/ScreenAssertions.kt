package com.example.cupcake.test

import androidx.navigation.NavController
import org.junit.Assert.assertEquals

/**
 * Extension function to assert that the current destination route matches the expected name.
 */
fun NavController.assertCurrentRouteName(expectedRouteName: String) {
    assertEquals(expectedRouteName, currentBackStackEntry?.destination?.route)
}
