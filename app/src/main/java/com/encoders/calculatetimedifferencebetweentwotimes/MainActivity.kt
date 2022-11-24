package com.encoders.calculatetimedifferencebetweentwotimes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val simpleDateFormat = SimpleDateFormat("hh:mm a")

        val date1 = simpleDateFormat.parse("06:00 AM")
        val date2 = simpleDateFormat.parse("12:00 PM")

        var difference: Long = date2.time - date1.time
        var days = (difference / (1000 * 60 * 60 * 24)).toInt()
        var hours =
            ((difference.toInt() - 1000 * 60 * 60 * 24 * days) / (1000 * 60 * 60)) as Int
        var min =
            (difference.toInt() - 1000 * 60 * 60 * 24 * days - 1000 * 60 * 60 * hours) as Int / (1000 * 60)
        hours = if (hours < 0) -hours else hours
        Log.e("=======Hours", " :: $hours")
        Log.e("=======min", " :: $min")



    }
}