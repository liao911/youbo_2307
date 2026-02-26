package com.baiwei.youbo_2307.repository

import com.baiwei.youbo_2307.network.RetrofitClient
import com.baiwei.youbo_2307.network.model.Post

class PostRepository {
    suspend fun getPost(id: Int): Post {
        return RetrofitClient.api.getPost(id)
    }
}
