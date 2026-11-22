package com.example.lab14widgetsglance

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class ProyectoWidget : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = ProyectoWidgetContent()
}
