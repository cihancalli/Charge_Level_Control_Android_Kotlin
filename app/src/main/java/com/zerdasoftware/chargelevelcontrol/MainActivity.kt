package com.zerdasoftware.chargelevelcontrol

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var chargeLevelReceiver:ChargeLevelReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chargeLevelReceiver = ChargeLevelReceiver()
    }

    override fun onResume() {
        super.onResume()
        val filter = IntentFilter()
        filter.addAction("android.intent.action.BATTERY_LOW")
        registerReceiver(chargeLevelReceiver,filter)
    }

    override fun onStop() {
        super.onStop()

        unregisterReceiver(chargeLevelReceiver)
    }
}