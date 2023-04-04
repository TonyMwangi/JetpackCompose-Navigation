package navigation

const val ID="id"

sealed class Screens(val route: String) {
    object HomeScreen : Screens(route = "homeScreen")
    object DetailsScreen: Screens(route = "detailsScreen")
    object RateUsScreen: Screens(route = "rateUsScreen/{$ID}")
    fun passArgument(id: Double): String {
        return "rateUsScreen/$id"
    }

}