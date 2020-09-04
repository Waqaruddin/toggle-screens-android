package com.example.fragmentdynamically

import android.hardware.camera2.params.BlackLevelPattern
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()



    }

    private fun init() {
        var switch:Boolean = true
        button_change.setOnClickListener {
            var fragmentManger = supportFragmentManager
            var fragmentTransaction = fragmentManger.beginTransaction()

             if(switch){
                fragmentTransaction.add(R.id.fragement_container, BlankFragment()).commit()
                switch = false
            }else{
                fragmentTransaction.add(R.id.fragement_container, SecondFragment()).commit()
                switch = true
            }
        }
    }


}