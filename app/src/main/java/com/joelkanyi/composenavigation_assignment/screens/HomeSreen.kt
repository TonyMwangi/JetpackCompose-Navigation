package screens


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import navigation.Screens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navController: NavController,
){
   Scaffold(
       topBar={
           TopAppBar(
               title = {
                   Text(text = "Home Screen")
               }
           )
       }
   ) {
       Button(
           modifier= Modifier
               .fillMaxSize()
               .wrapContentSize(Alignment.Center),

           onClick = {
               navController.navigate(Screens.DetailsScreen.route) }
       ) {

           Text(text = "Go to Details Screen")
       }

   }
}
@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen(navController= rememberNavController())

}