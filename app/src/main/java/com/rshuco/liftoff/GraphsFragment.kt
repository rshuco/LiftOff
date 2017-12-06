package com.rshuco.liftoff

import android.os.Bundle
import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class GraphsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activity = activity as AppCompatActivity
        val actionBar = activity.supportActionBar
        actionBar!!.setTitle(R.string.title_graphs)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_graphs, container, false)
        return rootView
    }
}
