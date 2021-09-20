package com.android.guicelebrini.ethanolorgas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

private lateinit var textEthanol : TextView
private lateinit var textGas : TextView
private lateinit var buttonCalculate : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewsById()

        buttonCalculate.setOnClickListener(View.OnClickListener {
            
        })

    }

    private fun findViewsById(){
        textEthanol = findViewById(R.id.edit_ethanol)
        textGas = findViewById(R.id.edit_gas)
        buttonCalculate = findViewById(R.id.buttonCalculate)
    }
}