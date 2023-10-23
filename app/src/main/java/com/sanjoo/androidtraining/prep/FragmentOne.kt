package com.sanjoo.androidtraining.prep

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.sanjoo.androidtraining.R


class FragmentOne : Fragment() {
    private lateinit var communicatorForF1F2:CommunicatorForF1F2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=layoutInflater.inflate(R.layout.fragment_one,container,false)

        val btnSend:Button=view.findViewById(R.id.f1_sendBtn)
        val inputText:EditText=view.findViewById(R.id.f1_et_name)

        if (activity is CommunicatorForF1F2){
        communicatorForF1F2=activity as CommunicatorForF1F2
            }else{
                throw TypeCastException("custom message")
        }
        btnSend.setOnClickListener{
            communicatorForF1F2.passData(inputText.text.toString())
        }

        return view
    }
}