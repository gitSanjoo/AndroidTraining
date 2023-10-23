package com.sanjoo.androidtraining.prep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sanjoo.androidtraining.R
import com.sanjoo.androidtraining.all.fragment2
import com.sanjoo.androidtraining.databinding.Activity1Binding

class Activity1 : AppCompatActivity(),CommunicatorForF1F2 {
    lateinit var binding:Activity1Binding
//    lateinit var binding:Activity1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = Activity1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val fragmentOne = FragmentOne()
        val fragmentTwo = FragmentTwo()

        binding.btnF1.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, fragmentOne)
                commit()
            }
        }

        binding.btnF2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, fragmentTwo)
                commit()
            }
        }
        binding.btnForActivity1to2.setOnClickListener{
            val intent=Intent(this,Activity2::class.java)
            startActivity(intent)
        }
    }

    override fun passData(editTextInput: String) {
        val bundle=Bundle()
        bundle.putString("msg",editTextInput)
        val trans=this.supportFragmentManager.beginTransaction()
         val f2=FragmentTwo()
        f2.arguments=bundle

        trans.replace(R.id.fragment_container,f2)
        trans.commit()
    }

}