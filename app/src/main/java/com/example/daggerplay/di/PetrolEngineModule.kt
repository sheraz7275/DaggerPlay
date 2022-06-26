package com.example.daggerplay.di

import com.example.daggerplay.Engine
import com.example.daggerplay.PetrolEngine
import dagger.Module
import dagger.Provides

@Module
 class PetrolEngineModule()  {




    @Provides
    fun providesEngine(engine: PetrolEngine): Engine =engine

}