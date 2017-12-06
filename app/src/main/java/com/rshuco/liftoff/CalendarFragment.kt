package com.rshuco.liftoff

import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.app.AppCompatActivity
import com.applandeo.materialcalendarview.EventDay
import com.rshuco.liftoff.R.id.calendarView





class CalendarFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activity = activity as AppCompatActivity
        val actionBar = activity.supportActionBar
        actionBar!!.setTitle(R.string.title_calendar)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_calendar, container, false)
        return rootView
    }

}
