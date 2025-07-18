package com.example.studentjourney.Api;


import com.example.studentjourney.Entity.LoginRequest;
import com.example.studentjourney.Entity.LoginResponse;
import com.example.studentjourney.Entity.SignupRequest;
import com.example.studentjourney.Entity.SignupResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("public/create")
    Call<SignupResponse> signup(@Body SignupRequest signupRequest);

    @POST("public/login")
    Call<LoginResponse> login(@Body LoginRequest loginRequest);
}

