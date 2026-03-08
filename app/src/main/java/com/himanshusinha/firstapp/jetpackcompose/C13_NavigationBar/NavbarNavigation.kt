package com.himanshusinha.firstapp.jetpackcompose.jetpackcomposemissionandroid.jetpackcompose.c13_navigation_bar


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.himanshusinha.firstapp.jetpackcompose.C13_NavigationBar.NavbarProfileScreen
import com.himanshusinha.firstapp.jetpackcompose.C13_NavigationBar.NavbarSearchScreen

@Composable
fun NavbarNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavBarRoutes.Home
    ){

        composable<NavBarRoutes.Home> {
            NavbarHomeScreen(navController)
        }

        composable<NavBarRoutes.Search> {
            NavbarSearchScreen(navController)
        }

        composable<NavBarRoutes.Notifications> {
            NavbarNotificationScreen(navController)
        }

        composable<NavBarRoutes.Profile> {
            NavbarProfileScreen(navController)
        }

    }

}