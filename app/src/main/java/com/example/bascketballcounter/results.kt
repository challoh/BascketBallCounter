package com.example.bascketballcounter

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_results.*
import org.jetbrains.anko.toast

class results : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        var toronto =intent.getStringExtra("toronto")
        var rockets=intent.getStringExtra("rockets")

        txtToronto.text=toronto
        txtRockets.text=rockets

        Toast.makeText(
            this,toronto.toString(),Toast.LENGTH_SHORT).show()

        Toast.makeText(this,rockets.toString(),
            Toast.LENGTH_LONG).show()


    }
    fun alertDialouge(msg:String){
        val builder=AlertDialog.Builder(this)
        builder.setTitle("Results")
        builder.setMessage(msg)
        builder.setPositiveButton("okey",DialogInterface.OnClickListener(){ dialouge, which->
            finish()})
        builder.setNegativeButton("okey",DialogInterface.OnClickListener(){ dialouge, which->
            finish()})
        builder.setNeutralButton("okey",DialogInterface.OnClickListener(){ dialouge, which->
            finish()})
    }
}
