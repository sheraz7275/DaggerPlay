package com.example.daggerplay.di

import com.example.daggerplay.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {


    @Singleton
    @Provides
    fun providesDriver():Driver=Driver()


}