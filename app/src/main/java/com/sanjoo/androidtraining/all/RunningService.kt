package com.sanjoo.androidtraining.all

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.sanjoo.androidtraining.R

class RunningService: Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        when(intent?.action){
            Actions.START.toString()->start()
            Actions.START.toString()->stopSelf()
        }
        return super.onStartCommand(intent, flags, startId)
    }

    private fun start(){
        val notification=NotificationCompat.Builder(this,"running_channel")
                .setSmallIcon(R.drawable.baseline_ac_unit_24)
                .setContentTitle("run is running")
                .setContentTitle("elapsed time : 00:50")
                .build()
        startForeground(1,notification)
    }

    enum class Actions{
        START,STOP
    }
}