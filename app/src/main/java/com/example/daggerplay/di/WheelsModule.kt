package com.example.daggerplay.di

import com.example.daggerplay.Rims
import com.example.daggerplay.Tiers
import com.example.daggerplay.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideTiers(): Tiers = Tiers()

    @Provides
    fun providesRims(): Rims = Rims()


    @Provides
    fun providesWheels(rims: Rims, tiers: Tiers): Wheels = Wheels(rims = rims, tiers = tiers)

}