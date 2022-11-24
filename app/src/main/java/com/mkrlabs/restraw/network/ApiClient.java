package com.mkrlabs.restraw.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
//http://127.0.0.1:8000/api/food/1
    private  static String BASE_URL = "https://127.0.0.1:8000";
    public static Retrofit retrofit;

    public static Retrofit getInstance(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return  retrofit;
    }
}
