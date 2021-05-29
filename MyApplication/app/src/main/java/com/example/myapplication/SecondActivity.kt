package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.e(SecondActivity::class.java.name, "onCreate")

        addFirstFragment()

        val button = findViewById<Button>(R.id.second_btn)
        button.setOnClickListener {
            addSecondFragment()
        }

       val fButton = findViewById<Button>(R.id.button1)
        fButton.setOnClickListener {
            replaceWithThirdFragment()
        }

        val sButton = findViewById<Button>(R.id.button2)
        sButton.setOnClickListener {
            backToFirstFragment()
        }

        val tButton = findViewById<Button>(R.id.button3)
        tButton.setOnClickListener {
            closeActivity()
        }
    }

    fun addFirstFragment() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val firstFragment = F1A2.newInstance()
        val tag = F1A2::class.java.name

        val addTransaction = transaction.add(
                R.id.fragment_1, firstFragment, tag
        )
        addTransaction.addToBackStack(tag)
        addTransaction.commit()
    }
    
    fun addSecondFragment() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val secondFragment = F2A2.newInstance()
        val tag = F2A2::class.java.name

        val addTransaction = transaction.add(
                R.id.fragment_1, secondFragment, tag
        )
        addTransaction.addToBackStack(tag)
        addTransaction.commit()
    }

    fun goToMainActivity() {
        val intent: Intent = Intent(this, MainActivity::class.java)

        startActivity(intent)

        finish()
    }

    fun backToFirstFragment() {
        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()

        val firstFragment = F1A2.newInstance()

        val tag = F1A2::class.java.name

        val replaceTransaction = transaction.add(
                R.id.f1_container,
                firstFragment,
                tag
        )

        replaceTransaction.addToBackStack(tag)
        replaceTransaction.commit()
    }

    fun closeActivity() {
        finishAffinity()
    }

    fun replaceWithThirdFragment() {
        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()

        val thirdFragment = F3A2.newInstance()

        val tag = F3A2::class.java.name

        val replaceTransaction = transaction.replace(
                R.id.f1_container,
                thirdFragment,
                tag
        )

        replaceTransaction.addToBackStack(tag)
        replaceTransaction.commit()
    }

    override fun onStart() {
        super.onStart()

        Log.e(SecondActivity::class.java.name, "onStart")
    }

    override fun onPause() {
        super.onPause()

        Log.e(SecondActivity::class.java.name, "onPause")
    }

    override fun onResume() {
        super.onResume()

        Log.e(SecondActivity::class.java.name, "onResume")
    }

    override fun onStop() {
        super.onStop()

        Log.e(SecondActivity::class.java.name, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e(SecondActivity::class.java.name, "onDestroy")
    }

}