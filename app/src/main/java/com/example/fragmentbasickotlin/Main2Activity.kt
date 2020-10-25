package com.example.fragmentbasickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val header=intent.getStringExtra("header")
        Toast.makeText(this@Main2Activity,header,Toast.LENGTH_SHORT).show()
    }
}
