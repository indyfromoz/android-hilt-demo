package com.example.hiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainModule {
    
    // Singleton annotation does not work in ActivityComponent/ActivityScope
    @ActivityScoped
    @Provides
    @Named("SomeString")
    fun provideActivityString() = "This is a string for an Activity"
}