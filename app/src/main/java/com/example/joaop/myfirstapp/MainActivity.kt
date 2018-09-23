package com.example.joaop.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun go_to_2(view: View){
        val myT = Toast.makeText(this, "Boa negada!", Toast.LENGTH_SHORT)
        myT.show()

        val twoAct = Intent(this, Main2Activity::class.java)
        startActivity(twoAct)
    }
}
