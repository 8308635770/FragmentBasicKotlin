package com.example.fragmentbasickotlin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragBlue : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blue,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragHEader = view.findViewById<TextView>(R.id.frag_header)

        fragHEader.setOnClickListener(View.OnClickListener {

            val intent = Intent(activity,Main2Activity::class.java)
            intent.putExtra("header",fragHEader.text.toString())
            startActivity(intent)

//            startActivity(Intent(activity,Main2Activity::class.java))
        })
    }
}