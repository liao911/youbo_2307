package com.baiwei.youbo_2307.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.baiwei.youbo_2307.base.BaseViewModel
import com.baiwei.youbo_2307.network.model.Post
import com.baiwei.youbo_2307.repository.PostRepository
import kotlinx.coroutines.launch

class SampleViewModel : BaseViewModel() {
    private val repo = PostRepository()
    val post = MutableLiveData<Post>()

    fun load(id: Int) {
        viewModelScope.launch {
            val data = repo.getPost(id)
            post.value = data
        }
    }
}
