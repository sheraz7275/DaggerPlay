package com.example.daggerplay

import android.app.Application
import com.example.daggerplay.di.DaggerAppComponent

class MyApplication:Application() {


    val appComponent = DaggerAppComponent.create()

}