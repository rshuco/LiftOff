package com.rshuco.liftoff

import android.annotation.TargetApi
import android.os.Bundle
import android.app.Fragment
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activity = activity as AppCompatActivity
        val actionBar = activity.supportActionBar
        actionBar!!.setTitle(R.string.app_name)


        val button : Button = getView()?.findViewById<Button>(R.id.btn_add_new_exercise) as Button


        /*
        button.onClick {
            startActivity<ExerciseCategoriesActivity>()
        }


        button.setOnClickListener { view ->
            // Handler code here.
            val intent = ExerciseCategoriesActivity.newIntent(context, view)
            startActivity(intent)
        }
        */

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_home, container, false)
        return rootView
    }
}
