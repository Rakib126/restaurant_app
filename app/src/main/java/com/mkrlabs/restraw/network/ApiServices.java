package com.mkrlabs.restraw.network;

import com.mkrlabs.restraw.model.Food;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiServices {

    @GET("/api/food/{user_id}")
    Call<Food> getAllFoods(@Path("user_id") String user_id);

    @GET("/api/food/{user_id}/slider")
    Call<Food> getSliderFoods(@Path("user_id") String user_id);


}
