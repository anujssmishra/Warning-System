package com.example.vatron_navigation.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Have an image in your gallery and wan't to detect from it.\n\nDon't worry we have a solution.\n\n" +
                "At any point click on the gallery icon at left corner to choose a image from your gallery and detect it. "

    }
    val text: LiveData<String> = _text
}

