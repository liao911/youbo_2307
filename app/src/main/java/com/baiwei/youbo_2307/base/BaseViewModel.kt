package com.baiwei.youbo_2307.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope

open class BaseViewModel : ViewModel() {
    val scope: CoroutineScope = viewModelScope
}
