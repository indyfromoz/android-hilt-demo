package com.example.hiltdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MainViewModel @Inject constructor(
    @Named("DisplayString") testString: String
)  : ViewModel() {
    
    init {
        Log.d("MainViewModel", "Injected string - $testString")
    }
}