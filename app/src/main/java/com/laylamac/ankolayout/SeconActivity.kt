package com.laylamac.ankolayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import org.jetbrains.anko.dip
import org.jetbrains.anko.padding
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class SeconActivity : AppCompatActivity() {

    private var name : String = ""
    private lateinit var nameTextview : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            padding = dip (15)
            nameTextview = textView()
        }

        val intent = intent
        name = intent.getStringExtra("name")
        nameTextview.text = name
    }

}
