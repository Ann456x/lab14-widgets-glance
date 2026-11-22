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

class HorarioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize().padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Horario del Día", style = MaterialTheme.typography.headlineSmall)
                Text(text = "08:00 - Programación en Móviles (Lab 402)", modifier = Modifier.padding(top = 12.dp))
                Text(text = "10:30 - Modelado de Procesos (Aula 205)", modifier = Modifier.padding(top = 4.dp))
                Button(onClick = { finish() }, modifier = Modifier.padding(top = 20.dp)) {
                    Text(text = "Volver")
                }
            }
        }
    }
}
