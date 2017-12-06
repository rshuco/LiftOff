package com.rshuco.liftoff

import android.os.Bundle
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.FrameLayout
import android.app.FragmentManager
import android.app.FragmentTransaction
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                var homeFragment = HomeFragment()

                var transactionManager = fragmentManager.beginTransaction()

                var container:ViewGroup = findViewById<ViewGroup>(R.id.fragment_container) as ViewGroup

                container.removeAllViews()

                transactionManager.replace(R.id.fragment_container, homeFragment)
                transactionManager.addToBackStack(null)
                transactionManager.commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_program -> {

                var fragment = GoalsFragment()

                var transactionManager = fragmentManager.beginTransaction()

                var container:ViewGroup = findViewById<ViewGroup>(R.id.fragment_container) as ViewGroup

                container.removeAllViews()

                transactionManager.replace(R.id.fragment_container, fragment)
                transactionManager.addToBackStack(null)
                transactionManager.commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_calendar -> {

                var calendarFragment = CalendarFragment()
                var transactionManager = fragmentManager.beginTransaction()

                var container:ViewGroup = findViewById<ViewGroup>(R.id.fragment_container) as ViewGroup

                container.removeAllViews()

                transactionManager.replace(R.id.fragment_container, calendarFragment)
                transactionManager.addToBackStack(null)
                transactionManager.commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_graphs -> {

                var graphsFragment = GraphsFragment()
                var transactionManager = fragmentManager.beginTransaction()

                var container:ViewGroup = findViewById<ViewGroup>(R.id.fragment_container) as ViewGroup

                container.removeAllViews()

                transactionManager.replace(R.id.fragment_container, graphsFragment)
                transactionManager.addToBackStack(null)
                transactionManager.commit()

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationBar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        fragmentManager.beginTransaction().add(R.id.fragment_container, HomeFragment()).commit()
    }

}
