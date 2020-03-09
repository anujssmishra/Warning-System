package com.example.vatron_navigation.ui.send

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SendViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Loved our app?If yes then its time to share and earn your rewards\n\nFor every 50 downloads"+
        " of our app by your friends you will be given a amazon gift card of 200"
    }
    val text: LiveData<String> = _text
}