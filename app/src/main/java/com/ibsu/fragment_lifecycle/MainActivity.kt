package com.ibsu.fragment_lifecycle

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log.d
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        d("Function call, onStart", "Activity onCreate called")
        setContentView(R.layout.activity_main)


    }


    override fun onStart() {
        super.onStart()
        d("Function call, onStart", "Activity onStart called")


        //activity started
        //became visible to user

    }

    override fun onResume() {
        super.onResume()
        d("Function call, onResume", "Activity onResume called")

        //Activity is in foreground
        //user can interact with it

        //An activity is considered to be in the foreground when it is the currently focused and active component on the screen.
    }

    override fun onPause() {
        super.onPause()
        d("Function call, onPause", "Activity onPause called")

        //all resources activity needs will be kept in memory
        //because user might come back to activity

        //and if activity is in paused state and user does comes back to activity
        //onResume() will be called

        //onPause() -> onResume()

//        An activity is considered to be visible to the user when any part of its UI is visible on the screen, even if it is not in the foreground.
//        This includes scenarios where the activity's UI is partially visible, such as when it is partially covered by another activity or a system dialog.
    }

    override fun onStop() {
        super.onStop()
        d("Function call, onStop", "Activity onStop called")

        //activity (whole window) is not visible to user

        //if activity is in stopped state and user comes back to activity
        //onRestart() is called and then on onStart() is called

        //onStop() -> onRestart() -> onStart() -> onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        d("Function call, onDestroy", "Activity onDestroy called")

        //user intentionally closed activity,
        //or user clicked back button,
        //or system kills your app

        //or when global configuration changes (e.x rotation change)
    }

    override fun onRestart() {
        super.onRestart()

        d("Function call, onRestart", "Activity onRestart called")

//        called when user comes back to app that was in background
    }

}