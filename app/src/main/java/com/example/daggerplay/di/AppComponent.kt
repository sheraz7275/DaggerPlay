package com.example.daggerplay.di

import com.example.daggerplay.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver():Driver

}