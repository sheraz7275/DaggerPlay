package com.example.daggerplay

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor():Engine{
    override fun addEngine() {

        Log.d("##","Diesel Engine Added")
    }
}