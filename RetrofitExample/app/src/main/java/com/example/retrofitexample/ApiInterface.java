package com.example.retrofitexample;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    public static final String BASE_URL="https://jsonplaceholder.typicode.com/";

    @GET("/posts")
    Call<ResponseBody> apiData();
}
