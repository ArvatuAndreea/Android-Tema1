package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(MainActivity::class.java.name, "onCreate")

        //val fragment = findViewById<Fragment>(R.id.frag)

        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener{
            sendToSecondActivity()
        }
    }

    override fun onStart() {
        super.onStart()

        Log.e(MainActivity::class.java.name, "onStart")
    }

    override fun onPause() {
        super.onPause()

        Log.e(MainActivity::class.java.name, "onPause")
    }

    override fun onResume() {
        super.onResume()

        Log.e(MainActivity::class.java.name, "onResume")
    }

    override fun onStop() {
        super.onStop()

        Log.e(MainActivity::class.java.name, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e(MainActivity::class.java.name, "onDestroy")
    }

    fun sendToSecondActivity() {
       val intent: Intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
        finish()
    }
}