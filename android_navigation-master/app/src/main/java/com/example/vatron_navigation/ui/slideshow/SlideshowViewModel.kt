package com.example.vatron_navigation.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Have a Signboard you can't detect?\n\n" +
                "See a different type of Sign?\n\n" +
                "Send the Image to us and we won't disappoint you next time."
    }
    val text: LiveData<String> = _text
}