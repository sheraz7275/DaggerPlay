package com.example.daggerplay

import android.util.Log
import com.example.daggerplay.di.PerActivity
import javax.inject.Inject

@PerActivity
class Car@Inject constructor(private val engine: Engine, private val wheels: Wheels,private val driver: Driver) {


    fun buildCar(){
        engine.addEngine()
        wheels.addWheels()
        driver.assignDriver()
        Log.d("##", "${driver} start Car this $this")
    }


}