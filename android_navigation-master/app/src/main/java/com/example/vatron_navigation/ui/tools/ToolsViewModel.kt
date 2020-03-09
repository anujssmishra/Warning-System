package com.example.vatron_navigation.ui.tools

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToolsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This app is designed specifically for the people behind the wheel so you don't miss out any important" +
                "signboard while driving.\n\nYou can also detect from an image saved in your device.\n\n" +
                "At any point on any screen click on left floating button at bottom to detect from an existing image and " +
                "click on right floating button to detect from your camera.  "

    }
    val text: LiveData<String> = _text
}