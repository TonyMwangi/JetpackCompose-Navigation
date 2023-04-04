package screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RateUsScreen(
    id:Float,
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {

                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {

                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null )

                    }
                    Text(text = "Rate Us Screen")

                }

            )
        }

    ){
        Box(
            modifier = Modifier.fillMaxSize(),
            Alignment.Center
        ) {
            Text(text = "You Rate Us $id")
        }
    }
}
@Composable
@Preview
fun RateUsScreenPreview() {
    RateUsScreen(navController= rememberNavController(), id = 4.5f)
}
