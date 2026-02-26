package com.baiwei.youbo_2307.network

import com.baiwei.youbo_2307.network.model.Post
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("posts/{id}")
    suspend fun getPost(@Path("id") id: Int): Post
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
