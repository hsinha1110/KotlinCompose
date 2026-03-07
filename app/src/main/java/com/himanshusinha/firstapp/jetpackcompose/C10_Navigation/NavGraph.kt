package com.himanshusinha.firstapp.jetpackcompose.c10_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.himanshusinha.firstapp.jetpackcompose.jetpackcomposemissionandroid.jetpackcompose.c10_navigation.LoginScreenUI
import com.himanshusinha.firstapp.jetpackcomposemissionandroid.jetpackcompose.c10_navigation.HomeScreenUI

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.HomeScreen
    ) {

        composable<MyNavRoutes.LoginScreen> {
            LoginScreenUI(navController)
        }

        composable<MyNavRoutes.HomeScreen> {
            HomeScreenUI(navController)
        }

        composable<MyNavRoutes.WelcomeScreen> { backStackEntry ->

            val data = backStackEntry.toRoute<MyNavRoutes.WelcomeScreen>()

            WelcomeScreenUI(
                userName = data.userName,
                navController = navController
            )
        }
    }
}