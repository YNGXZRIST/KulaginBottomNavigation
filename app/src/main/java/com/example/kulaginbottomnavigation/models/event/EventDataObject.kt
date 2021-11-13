package com.example.kulaginbottomnavigation.models.event

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

object EventDataObject {
    @RequiresApi(Build.VERSION_CODES.O)
    fun getEvents() = listOf(
        Event("1 января", "новый год", LocalDate.of(2021,1, 1)),
        Event("Рождество Христово", "рождество", LocalDate.of(2021, 1, 7)),
        Event("День защитника отечества", "не служил-не мужик", LocalDate.of(2021, 2, 23)),
        Event("Межденородный женский день", "не забудь поздравить", LocalDate.of(2021, 3, 8)),
        Event("Праздник Весны и Труда", "выходной", LocalDate.of(2021, 5, 1)),
        Event("День Победы", "выходной", LocalDate.of(2021, 5, 9)),
        Event("Весенняя балткоса", "Главный праздник в году", LocalDate.of(2021, 5, 12)),

        Event("Летняя коса", "второй главный праздник в году", LocalDate.of(2021, 7, 4)),
    )
}