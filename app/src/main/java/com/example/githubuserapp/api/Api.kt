package com.example.githubuserapp.api

import com.example.githubuserapp.data.model.DetailUserResponse
import com.example.githubuserapp.data.model.User
import com.example.githubuserapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("/search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query : String
    ) : Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username : String
    ) : Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username : String
    ) : Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username : String
    ) : Call<ArrayList<User>>
}