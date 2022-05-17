package com.example.hiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    
    @Inject
    @Named("SomeString")
    lateinit var activityString: String
    
    @Inject
    lateinit var combinedString: String
    
    private val viewModel: MainViewModel by viewModels()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        Log.d("MainActivity", "Test string from MainActivity: $activityString")
        Log.d("MainActivity", "A complex string : $combinedString")
        viewModel
    }
}
