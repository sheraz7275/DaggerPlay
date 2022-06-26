package com.example.daggerplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerplay.di.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    @Inject lateinit var car1: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val activityComponent = DaggerActivityComponent.builder()
            .getCapacity(150)
            .getCylinder(5)
            .appComponent((applicationContext as MyApplication).appComponent)
            .build()

        activityComponent.inject(this)


        car.buildCar()
        car1.buildCar()



    }
}