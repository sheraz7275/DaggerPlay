package com.example.daggerplay

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor(val rims: Rims,val tiers: Tiers) {

    fun addWheels(){
        Log.d("##", "add Wheels")

    }
}