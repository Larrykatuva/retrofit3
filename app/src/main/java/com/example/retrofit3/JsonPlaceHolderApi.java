package com.example.retrofit3;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {

    @POST("addUser") //sending our body data inform of json to the posts endpoint. the general way
    Call<Post> createPost(@Body Post post);

}
