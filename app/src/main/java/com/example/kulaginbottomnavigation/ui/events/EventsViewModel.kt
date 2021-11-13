package com.example.kulaginbottomnavigation.ui.events

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kulaginbottomnavigation.models.event.Event
import com.example.kulaginbottomnavigation.models.event.EventDataObject
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
class EventsViewModel : ViewModel() {
    private val eventsList: MutableLiveData<List<Event>> = MutableLiveData()
    private var formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")

    init {
        eventsList.value = EventDataObject.getEvents()
    }

    fun getEventList() = eventsList

    fun updateEventList() {
        eventsList.value = EventDataObject.getEvents()
    }
}