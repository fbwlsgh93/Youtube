package com.example.youtube.service

import com.example.youtube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/626f4820-458f-4422-969f-57e58fed3345")
    fun listVideos(): Call<VideoDto>
}