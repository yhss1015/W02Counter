package com.example.w02counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w02counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            main.textAdd.text="${++count}"

        }
        main.btnDec.setOnClickListener {
            if(count >0)
                main.textAdd.text="${--count}"

        }
        main.btnInit.setOnClickListener{
            count=0
            main.textAdd.text="$count"
        }
    }
}