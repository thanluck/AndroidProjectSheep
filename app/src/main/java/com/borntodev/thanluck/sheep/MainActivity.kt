package com.borntodev.thanluck.sheep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonHello.setOnClickListener{


            var name = editTextName.text.toString()
            var age = editTextAge.text.toString()

            if (name == "" || age == ""){

                Toast.makeText(this,"Please Enter your name and age.",Toast.LENGTH_LONG).show()
            }else
            {
                var introduce = "Hello my name is $name. I'm $age year old."
                textViewHello.text = introduce
                Toast.makeText(this,"Success1.",Toast.LENGTH_LONG).show()
            }




        }
    }
}

