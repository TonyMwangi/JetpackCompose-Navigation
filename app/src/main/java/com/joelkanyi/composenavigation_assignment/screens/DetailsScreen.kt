package screens


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import navigation.Screens

@Composable
fun DetailsScreen(
    navController: NavController
)
{
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    IconButton(onClick = {

                        navController.popBackStack()
                    }) {
                         Icon(imageVector = Icons.Default.ArrowBack, contentDescription =null )
                    }
                    Text(text = "Detail Screen")

                }
            )
        }


    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            Alignment.Center
        ) {
            Button(
                onClick = { navController.navigate(Screens.RateUsScreen.passArgument(5.5) ) }
            ) {
                Text(text = "Go to Rate us Screen")
            }

        }
    }


}



