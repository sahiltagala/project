package com.example.mybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.button)
        btnStart.setOnClickListener {
            startActivity(Intent(this@MainActivity, Book::class.java))
        }

        val btnExit = findViewById<Button>(R.id.exit)
        btnExit.setOnClickListener {

            this@MainActivity.finish()
            exitProcess(0)
        }
    }
}

