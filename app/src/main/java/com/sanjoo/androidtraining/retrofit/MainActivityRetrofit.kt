package com.sanjoo.androidtraining.retrofit

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.sanjoo.androidtraining.R
import com.sanjoo.androidtraining.br.AirplaneReceiver
import com.sanjoo.androidtraining.databinding.ActivityMainRetrofitBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivityRetrofit : AppCompatActivity() {
    lateinit var binding:ActivityMainRetrofitBinding
    private val airplaneReceiver=AirplaneReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainRetrofitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //send broadcast
        binding.sendBrBtn.setOnClickListener{
            sendBroadcast(
                Intent("TEST_ACTION")
            )
        }

        registerReceiver(airplaneReceiver,
                IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
            )

        val quotesApi=RetrofitHelper.getRetrofit().create(QuoteApi::class.java)
        GlobalScope.launch {
            val result=quotesApi.getQuotes(1)
            if (result!= null){
                Log.d("retrofit",result.body().toString())
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(airplaneReceiver)
    }
}
