package com.example.mysignup;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("/api/v1/quotes/add")
    Call<Register> getUserInformation(@Field("name") String name,@Field("email") String email,@Field("password") String password);


}
