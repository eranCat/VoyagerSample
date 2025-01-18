package org.eran.project.tab.home

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import cafe.adriel.voyager.transitions.SlideTransition
import org.eran.project.screens.home.HomeScreen
import org.jetbrains.compose.resources.painterResource

object HomeTab : Tab {

    @Composable
    override fun Content() {
        Navigator(HomeScreen()){navigator ->
            SlideTransition(navigator)
        }
//        Box(Modifier.fillMaxSize(), Alignment.Center) {
//            Text("Home tab")
//        }
    }

    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.Home)
            return remember {
                TabOptions(
                    index = 0u,
                    title = "Home",
                    icon = icon
                )
            }
        }
}