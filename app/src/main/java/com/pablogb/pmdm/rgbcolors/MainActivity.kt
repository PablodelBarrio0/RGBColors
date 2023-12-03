package com.pablogb.pmdm.rgbcolors

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  rollButton: Button = findViewById(R.id.btnColor)
        rollButton.setOnClickListener{
            crearColor()
        }
    }

    private fun crearColor(){
        val  cRojo: TextInputEditText = findViewById(R.id.cmpRojo)
        val  cVerde: TextInputEditText = findViewById(R.id.cmpVerde)
        val  cAzul: TextInputEditText = findViewById(R.id.cmpAzul)
        val colorfondo: TextView= findViewById(R.id.cdColor)
        if (cRojo.length()<2 || cVerde.length()<2 || cAzul.length()<2){
            val toast: Toast = Toast.makeText(
                this,
                R.string.aviso,
                Toast.LENGTH_SHORT
            )
            toast.show()
        }
        else{
            colorfondo.apply{

                val substring="#"+ cRojo.text +cVerde.text + cAzul.text
                setBackgroundColor(Color.parseColor(substring))
                visibility=View.VISIBLE
            }
        }
    }
}