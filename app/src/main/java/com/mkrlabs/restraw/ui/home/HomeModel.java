package com.mkrlabs.restraw.ui.home;

import com.mkrlabs.restraw.model.Food;
import com.mkrlabs.restraw.model.FoodItem;
import com.mkrlabs.restraw.network.ApiClient;
import com.mkrlabs.restraw.network.ApiServices;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeModel implements HomeContract.Model.ModelResponse{

    HomeContract.Model model;

    ApiServices apiServices ;
    public HomeModel(HomeContract.Model model) {
        this.model = model;
        apiServices = ApiClient.getInstance().create(ApiServices.class);
    }

    @Override
    public void getFoodsResponse(String restaurant_id) {

        apiServices.getAllFoods(restaurant_id).enqueue(new Callback<Food>() {
            @Override
            public void onResponse(Call<Food> call, Response<Food> response) {

                if (response.isSuccessful() && response.code()==200){
                    Food food = response.body();
                    model.foodList(food);
                }else {
                    model.foodResponseError("Response Error");
                }
            }
            @Override
            public void onFailure(Call<Food> call, Throwable t) {
                model.foodResponseError("Error "+t.getLocalizedMessage());

            }
        });

    }

    @Override
    public void getSliderImages(String restaurant_id) {

        apiServices.getSliderFoods(restaurant_id).enqueue(new Callback<Food>() {
            @Override
            public void onResponse(Call<Food> call, Response<Food> response) {

                if (response.isSuccessful() && response.code()==200){
                    Food food = response.body();
                    model.sliderFoodList(food);
                }else {
                    model.foodResponseError("Response Error");
                }

            }

            @Override
            public void onFailure(Call<Food> call, Throwable t) {
                model.foodResponseError(""+t.getLocalizedMessage());
            }
        });







    }

}
