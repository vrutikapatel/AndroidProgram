package com.example.retrofitgetdataexample;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    public static final String BASE_URL="https://jsonplaceholder.typicode.com/";

    @GET("/posts/1/comments")
    Call<ResponseBody> data();
}
