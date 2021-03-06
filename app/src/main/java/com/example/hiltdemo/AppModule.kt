package com.example.hiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

// Containers for dependencies that live specific amount of time, in this case, lifetime of the
// application.

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    
    @Provides
    @Singleton
    @Named("DisplayString")
    fun provideTestString() = "This is a string we display"
}