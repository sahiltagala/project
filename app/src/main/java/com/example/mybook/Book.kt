package com.example.mybook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Book : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val btnBack = findViewById<Button>(R.id.back)
        btnBack.setOnClickListener {
            Toast.makeText(this, "Thanks for Reading!!", Toast.LENGTH_SHORT).show()
            this.finish()
        }

    }

}
