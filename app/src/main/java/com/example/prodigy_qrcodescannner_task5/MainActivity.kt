package com.example.prodigy_qrcodescannner_task5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.prodigy_qrcodescannner_task5.ui.theme.Prodigy_QRCodeScannner_Task5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prodigy_QRCodeScannner_Task5Theme {
                Surface(modifier = Modifier) {
                    QRScannerScreen()
                }
            }
        }
    }
}
