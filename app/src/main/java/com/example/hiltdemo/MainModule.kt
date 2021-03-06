package com.example.hiltdemo

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainModule {
    
    // Singleton annotation does not work in ActivityComponent/ActivityScope
    @ActivityScoped
    @Provides
    @Named("SomeString")
    fun provideActivityString(
        @ApplicationContext context: Context
    ) = context.getString(R.string.string_to_inject)
    
    @ActivityScoped
    @Provides
    fun provideCombinedString(
        @ApplicationContext context: Context,
        @Named("DisplayString") testString: String
    ) = "${context.getString(R.string.string_to_inject)} - $testString"
}