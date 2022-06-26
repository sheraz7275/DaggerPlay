package com.example.daggerplay.di

import com.example.daggerplay.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@PerActivity
@Component(dependencies = [AppComponent::class], modules = [PetrolEngineModule::class, WheelsModule::class])
interface ActivityComponent {


    /*
    * singleton works in same component not whole application , means singleton is singleton for that not whole component
    * if you use singleton in other component then it would be different object
    * */


    @Component.Builder
    interface Builder{

        @BindsInstance
        fun getCapacity(@Named("capacity")value:Int):Builder

        @BindsInstance
        fun getCylinder(@Named("cylinder")value: Int):Builder

        fun appComponent(appComponent: AppComponent):Builder

        fun build():ActivityComponent
    }

    fun inject(activity: MainActivity)
}