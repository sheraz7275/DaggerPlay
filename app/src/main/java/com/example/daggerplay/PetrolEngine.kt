package com.example.daggerplay

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("capacity")private val capacity:Int, @Named("cylinder")private val cylinder:Int):Engine {
    override fun addEngine() {
        Log.d("##","Petrol Engine Added with $cylinder cylinder capacity of $capacity cc")
    }
}