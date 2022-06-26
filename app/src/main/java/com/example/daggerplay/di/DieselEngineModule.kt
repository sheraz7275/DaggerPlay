package com.example.daggerplay.di

import android.util.Log
import com.example.daggerplay.DieselEngine
import com.example.daggerplay.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Inject


@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindsDieselEngine(engine: DieselEngine):Engine


}