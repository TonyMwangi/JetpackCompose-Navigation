package navigation

import screens.HomeScreen
import screens.DetailsScreen
import screens.RateUsScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.HomeScreen.route
    ) {
        // Home Screen
        composable(route = Screens.HomeScreen.route) {
            HomeScreen(navController = navController)
        }

        // DetailsScreen
        composable(route = Screens.DetailsScreen.route) {
            DetailsScreen(navController = navController)
        }

        // RateUsScreen
        composable(route = Screens.RateUsScreen.route,
            arguments = listOf(
                navArgument(name=ID){
                    type= NavType.FloatType
                    defaultValue=-1f
                }
            )
        ) {
            RateUsScreen(

                navController = navController,
                id = (it.arguments?.getFloat(ID)) ?: -1f
            )
        }
    }
}