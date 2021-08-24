package com.example.mealordeingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnOrder.setOnClickListener {
            val checkedMealRadioButtonId = rgMeals.checkedRadioButtonId
            val meal = findViewById<RadioButton>(checkedMealRadioButtonId)
            val chapati = cbChapati.isChecked
            val poori = cbPoori.isChecked
            val gulabjamun = cbGulabJamun.isChecked
            val orderString = "Your order is:\n" + "\n" + "${meal.text}" + " "  +
                    (if (chapati) "\nChapati" else "") +
                    (if (poori) "\nPoori" else "") +
                    (if (gulabjamun) "\nGulab Jamun" else "")
            tvOrder.text = orderString
        }
    }
}