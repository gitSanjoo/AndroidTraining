package com.sanjoo.androidtraining.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sanjoo.androidtraining.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivityRetrofit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_retrofit)

        val quotesApi=RetrofitHelper.getRetrofit().create(QuoteApi::class.java)
        GlobalScope.launch {
            val result=quotesApi.getQuotes(1)
            if (result!= null){
                Log.d("retrofit",result.body().toString())
            }
        }
    }
}