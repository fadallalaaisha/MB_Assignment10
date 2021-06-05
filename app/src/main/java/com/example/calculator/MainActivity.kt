package com.example.calculator

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

        var etEnterNo=findViewById<EditText>(R.id.etEnterNo)
        var etEnterNo2=findViewById<EditText>(R.id.etEnterNo2)
        var etResult=findViewById<TextView>(R.id.etResult)

        var add=findViewById<Button>(R.id.tvbtnAdd)
        var Sub=findViewById<Button>(R.id.tvbtnSubtract)
        var Divide=findViewById<Button>(R.id.tvbtnModulus)
        var Times=findViewById<Button>(R.id.tvbtnMultiply)

        add.setOnClickListener {
            Toast.makeText(baseContext,"inputNumber",Toast.LENGTH_LONG).show()
            var etEnterNo=etEnterNo.text.toString().toInt()
            var etEnterNo2=etEnterNo2.text.toString().toInt()
            var result=etEnterNo + etEnterNo2

            etResult.text=("$result")
        }
         Sub.setOnClickListener {
             Toast.makeText(baseContext,"inputNumber",Toast.LENGTH_LONG).show()
             var etEnterNo2=etEnterNo2.text.toString().toInt()
             var etEnterNo=etEnterNo.text.toString().toInt()
             var result=etEnterNo-etEnterNo2
             etResult.text=("$result")
         }
        Divide.setOnClickListener {
            Toast.makeText(baseContext,"inputNumber",Toast.LENGTH_LONG).show()
            var etEnterNo2=etEnterNo2.text.toString().toInt()
            var etEnterNo=etEnterNo.text.toString().toInt()
            var result=etEnterNo%etEnterNo2
            etResult.text=("$result")
        }
        Times.setOnClickListener {
            Toast.makeText(baseContext,"inputNumber",Toast.LENGTH_LONG).show()
            var etEnterNo2=etEnterNo2.text.toString().toInt()
            var etEnterNo=etEnterNo.text.toString().toInt()
            var result=etEnterNo*etEnterNo2
            etResult.text=("$result")
        }
    }
}