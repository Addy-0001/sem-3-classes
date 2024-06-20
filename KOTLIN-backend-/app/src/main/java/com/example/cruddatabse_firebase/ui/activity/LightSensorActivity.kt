package com.example.cruddatabse_firebase.ui.activity

import android.hardware.Sensor
import android.hardware.SensorEventListener
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cruddatabse_firebase.R
import com.example.cruddatabse_firebase.databinding.ActivityLightSensorBinding

class LightSensorActivity : AppCompatActivity() , SensorEventListener{
    lateinit var sensor : Sensor;
    lateinit var sensorManager : SensorManager;
    lateinit var lightSensorBinding: ActivityLightSensorBinding

    fun checkSensor() : Boolean{
        var sensor = true;
        if(sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) == null){
            sensor = false;
        }
        return sensor;
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_light_sensor)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}