package com.example.fragmentbasickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_frag_red=btn_frag_red
        val btn_frag_blue=btn_frag_blue1


        val fragRed  = FragRed();
        val bundle_red=Bundle()
        bundle_red.putString("FragmentName","Red Fragment")
        fragRed.arguments=bundle_red
        val fragBlue = FragBlue();
        val bundle_blue=Bundle()
        bundle_blue.putString("FragmentName","Blue Fragment")

        btn_frag_red.setOnClickListener(View.OnClickListener {



            val faragmentManager = supportFragmentManager
            val fragTrans = faragmentManager.beginTransaction()
            fragTrans.replace(R.id.frag_container,fragRed).commit()
        })

        btn_frag_blue.setOnClickListener(View.OnClickListener {

            val faragmentManager = supportFragmentManager
            val fragTrans = faragmentManager.beginTransaction()
            fragTrans.replace(R.id.frag_container,fragBlue).commit()
        })

    }
}
