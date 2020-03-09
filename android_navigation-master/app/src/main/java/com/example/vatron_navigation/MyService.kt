package com.example.vatron_navigation

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast


class MyService : Service() {
    override fun onBind(intent: Intent): IBinder? { // TODO: Return the communication channel to the service.
        throw UnsupportedOperationException("Not yet implemented")
    }

    override fun onCreate() {
        Toast.makeText(this, "The new Service was Created", Toast.LENGTH_LONG).show()
    }

    override fun onStart(
        intent: Intent,
        startId: Int
    ) { // For time consuming an long tasks you can launch a new thread here...
        Toast.makeText(this, " Service Started", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show()
    }
}