package com.rshuco.liftoff

import android.os.Bundle
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.FrameLayout
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_calendar.view.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_program -> {

                var fragment = GoalsFragment()
                var transactionManager = fragmentManager.beginTransaction()

                var container:ViewGroup = findViewById<ViewGroup>(R.id.fragment_container) as ViewGroup;

                container.removeAllViews();

                transactionManager.replace(R.id.fragment_container, fragment)
                transactionManager.addToBackStack(null)
                transactionManager.commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_calendar -> {



//                supportFragmentManager.inTransaction {
//                    replaceFragment(R.id.fragment_container, 0);
//
//                }

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_graphs -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationBar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, CalendarFragment()).commit();
    }



    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
        val fragmentTransaction = beginTransaction()
        fragmentTransaction.func()
        fragmentTransaction.commit()
    }

    fun AppCompatActivity.addFragment(fragment: Fragment, frameId: Int){
        supportFragmentManager.inTransaction { add(frameId, fragment) }
    }


    fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int) {
        supportFragmentManager.inTransaction{replace(frameId, fragment)}
    }

}
