package com.example.myapplication

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(),SensorEventListener {
    private lateinit var gx:TextView
    private lateinit var gy:TextView
    private lateinit var gz:TextView

    private  lateinit var sensorManager:SensorManager
    private lateinit var grySensor:Sensor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        sensorManager=getSystemService(Context.SENSOR_SERVICE) as SensorManager
        grySensor=sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE)
    }
    private fun init(){
        gx=findViewById(R.id.showX)
        gy=findViewById(R.id.showY)
        gz=findViewById(R.id.showZ)
    }

    override fun onSensorChanged(p0: SensorEvent?) {
        gx.text= p0!!.values[0].toString()
        gy.text= p0!!.values[1].toString()
        gz.text= p0!!.values[2].toString()
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
        TODO("Not yet implemented")
    }
}