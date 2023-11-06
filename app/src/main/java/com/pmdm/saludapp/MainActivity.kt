package com.pmdm.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val he = findViewById<EditText>(R.id.etName)
        val btnHello: AppCompatButton = findViewById(R.id.bntHello)

        btnHello.setOnClickListener {
            //Log.i("Test", "Botón Pulsado")
          var name = he.text.toString()


            val intentGA = Intent(this, GreetingActivity::class.java)
            intentGA.putExtra("EXTRA_NAME", name)
            startActivity(intentGA)


        }

        }
    }
