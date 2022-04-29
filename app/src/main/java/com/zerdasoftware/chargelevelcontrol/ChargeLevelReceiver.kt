package com.zerdasoftware.chargelevelcontrol

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ChargeLevelReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, p1: Intent?) {
        Toast.makeText(context,"your battery is running out",Toast.LENGTH_LONG).show()
    }
}