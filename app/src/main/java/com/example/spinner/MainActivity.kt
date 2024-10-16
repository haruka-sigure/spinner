package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spGender=findViewById<Spinner>(R.id.spinner)
        val etAge=findViewById<EditText>(R.id.etAge)
        val btOk=findViewById<Button>(R.id.btOk)
        val tvR=findViewById<TextView>(R.id.tvR)

        btOk.setOnClickListener {
            val age=etAge.text.toString().toInt()
            if (spGender.selectedItemPosition==0){
                when{
                    age<28 ->tvR.text=getString(R.string.no_hurry)
                    age<=33 ->tvR.text=getString(R.string.find_couple)
                    else ->tvR.text=getString(R.string.get_married)
                }
            }
            else{
                when{
                    age<25 ->tvR.text=getString(R.string.no_hurry)
                    age<=30 ->tvR.text=getString(R.string.find_couple)
                    else ->tvR.text=getString(R.string.get_married)
                }
            }
        }
    }
}