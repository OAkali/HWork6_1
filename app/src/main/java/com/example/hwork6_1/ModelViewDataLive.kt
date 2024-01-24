package com.example.hwork6_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ModelViewDataLive : ViewModel() {
    private var count = 0
    private val _counterLv = MutableLiveData<Int>()

    val liveData: LiveData<Int>
        get() = _counterLv

    fun dec() {
        _counterLv.value = --count
    }

    fun inc() {
        _counterLv.value = ++count
    }

}