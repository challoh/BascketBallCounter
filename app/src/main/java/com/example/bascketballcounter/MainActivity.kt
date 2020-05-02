package com.example.bascketballcounter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var teamscoresA:Int=0
        var teamscoresB:Int=0

        rockets.setOnClickListener {
            teamscoresA=teamscoresA +2
            rocketsPoints.setText(teamscoresA.toString())
        }
        toronto.setOnClickListener {
            teamscoresB=teamscoresB +2
            torontoPoints.setText(teamscoresB.toString())
        }
        btnresults.setOnClickListener {
            val intent=Intent(this,results::class.java)
            intent.putExtra("toronto",teamscoresA.toString())
            intent.putExtra("rockets",teamscoresB.toString())
            startActivity(intent)
//
//            val implicitintent=Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"))
//            startActivity(implicitintent)
//
//            val sendintent=Intent(Intent.ACTION_SEND)
//            sendintent.putExtra(Intent.EXTRA_TEXT,"Hello world")
//            sendintent.type="text/plain"
//            startActivity(sendintent)
        }
    }
}
