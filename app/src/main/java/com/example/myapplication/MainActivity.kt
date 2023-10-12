package com.example.myapplication

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
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
}