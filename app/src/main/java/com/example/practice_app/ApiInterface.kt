package com.example.practice_app

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @GET("api/student")
    fun getUsers(): Call<UserDataClass>

    @POST("api/student")
    fun createUser(): Call<UserDataClass>

}