package com.sanjoo.androidtraining.prep

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.sanjoo.androidtraining.R
import com.sanjoo.androidtraining.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
    var name:String?=""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=layoutInflater.inflate(R.layout.fragment_two,container,false)
        name= arguments?.getString("msg")
        val et=view.findViewById<TextView>(R.id.f2_et_name)
        et.text=name

//        val fragmentTwoBinding=FragmentTwoBinding.inflate(layoutInflater,container,false)
//        fragmentTwoBinding.f2EtName.text = arguments?.getString("msg")
        return view
    }
}