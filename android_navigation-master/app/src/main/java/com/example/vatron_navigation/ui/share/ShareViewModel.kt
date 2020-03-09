package com.example.vatron_navigation.ui.share

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShareViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Your feedback is really valueable to us, please feel free to share your inputs or any problems encountered" +
                " with us\n\n Thank You!"
    }
    val text: LiveData<String> = _text
}