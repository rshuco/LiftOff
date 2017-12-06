package com.rshuco.liftoff

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ExerciseCategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_categories)

        // Get a support ActionBar corresponding to this toolbar
        val ab = supportActionBar

        // Enable the Up button
        ab!!.setDisplayHomeAsUpEnabled(true)

        /*
        val selectView = intent.getStringExtra(INTENT_SELECT_VIEW)
                ?: throw IllegalStateException("field $INTENT_SELECT_VIEW missing in Intent")
        */
    }

    /*
    companion object {

        private val INTENT_SELECT_VIEW = "select_view"

        fun newIntent(context: Context, view: View): Intent {
            val intent = Intent(context, ExerciseCategoriesActivity::class.java)
            intent.putExtra(INTENT_SELECT_VIEW, view.id)
            return intent
        }
    }
    */
}
