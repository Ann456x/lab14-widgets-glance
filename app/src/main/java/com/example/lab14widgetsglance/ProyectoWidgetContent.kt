package com.example.lab14widgetsglance

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.cornerRadius
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.layout.width
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle

class ProyectoWidgetContent : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                WidgetFinalContent()
            }
        }
    }

    @Composable
    private fun WidgetFinalContent() {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(GlanceTheme.colors.background)
                .cornerRadius(20.dp)
                .padding(16.dp),
            verticalAlignment = Alignment.Top,
            horizontalAlignment = Alignment.Start
        ) {
            // Encabezado con estado en tiempo real
            Row(
                modifier = GlanceModifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "TecsupPlus · Panel Rápido",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = GlanceTheme.colors.onSurface
                    )
                )
            }

            Spacer(modifier = GlanceModifier.height(8.dp))

            // Bloque informativo (resumen + ultimas acciones)
            Column(
                modifier = GlanceModifier
                    .fillMaxWidth()
                    .background(GlanceTheme.colors.secondaryContainer)
                    .cornerRadius(12.dp)
                    .padding(10.dp)
            ) {
                Text(
                    text = "Asistencia: 96%  |  Próxima: Móviles 08:00",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = GlanceTheme.colors.onSecondaryContainer
                    )
                )
                Spacer(modifier = GlanceModifier.height(4.dp))
                Text(
                    text = "Última acción: Asistencia Lab 14 registrada (07:55)",
                    style = TextStyle(
                        fontSize = 11.sp,
                        color = GlanceTheme.colors.onSecondaryContainer
                    )
                )
            }

            Spacer(modifier = GlanceModifier.height(10.dp))

            // Accesos directos a funciones clave
            Row(
                modifier = GlanceModifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    text = "Inicio",
                    onClick = actionStartActivity<MainActivity>()
                )
                Spacer(modifier = GlanceModifier.width(6.dp))
                Button(
                    text = "Horario",
                    onClick = actionStartActivity<HorarioActivity>()
                )
                Spacer(modifier = GlanceModifier.width(6.dp))
                Button(
                    text = "Notas",
                    onClick = actionStartActivity<NotasActivity>()
                )
            }
        }
    }
}
