package com.udec.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 = findViewById<EditText>(R.id.text1)
        val nameText = findViewById<TextView>(R.id.nameText)
        val text2Input = findViewById<EditText>(R.id.text2)
        val ageText = findViewById<TextView>(R.id.age)
        val text3Input = findViewById<EditText>(R.id.text3)
        val gobutton = findViewById<Button>(R.id.save_button)

        gobutton.setOnClickListener(){
            if(text1.text.isEmpty() && text2Input.text.isEmpty() && text3Input.text.isEmpty()){
                Toast.makeText(this, "please type something", Toast.LENGTH_SHORT).show()
                //return@setOnClickListener

            }
            val name = text1.text

            Toast.makeText(this, "Bienvenido $name"  , Toast.LENGTH_SHORT).show()
            //ageText.text = text2Input.text
            //phoneNumberText.text = descriptionInput.text

            val save_button =gobutton
            save_button.setOnClickListener{
                var valoruno: Int = (text2Input.text.toString()).toInt()
                var valordos: Int = (text3Input.text.toString()).toInt()
                var resultado: String = (valoruno + valordos).toString()
                Toast.makeText(this, "El numero de la suerte es: $resultado "  , Toast.LENGTH_SHORT).show()
                // text3Input.text = (resultado)
            }


        }

    }


}


