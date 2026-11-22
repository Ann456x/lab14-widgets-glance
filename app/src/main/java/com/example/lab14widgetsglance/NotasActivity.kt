package com.example.lab14widgetsglance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class NotasActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize().padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Resumen de Calificaciones", style = MaterialTheme.typography.headlineSmall)
                Text(text = "Programación en Móviles: 16.5", modifier = Modifier.padding(top = 12.dp))
                Text(text = "Asistencia General: 96%", modifier = Modifier.padding(top = 4.dp))
                Button(onClick = { finish() }, modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = "Volver")
                }
            }
        }
    }
}
