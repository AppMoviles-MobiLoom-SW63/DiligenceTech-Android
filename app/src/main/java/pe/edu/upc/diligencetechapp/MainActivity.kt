package pe.edu.upc.diligencetechapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import pe.edu.upc.diligencetechapp.commons.Home
import pe.edu.upc.diligencetechapp.ui.theme.DiligenceTechAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiligenceTechAppTheme {
                Home()
            }
        }
    }
}