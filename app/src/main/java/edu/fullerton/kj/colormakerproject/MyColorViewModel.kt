package edu.fullerton.kj.colormakerproject

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "ViewModel"

class MyColorViewModel: ViewModel() {

    init {
        Log.d(TAG, "ViewModel instance created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "View Model instance about to be destroyed")
    }

    private var redColor = 0
    private var greenColor = 0
    private var blueColor = 0
    private var colors: IntArray = intArrayOf(redColor, greenColor, blueColor)

    fun currentSwitchState() : Boolean {
        return true
    }

}