package com.mkrlabs.restraw.ui.home;
import com.mkrlabs.restraw.model.Food;

public interface HomeContract{
    interface View{
        void showLoading();
        void hideLoading();
        void foodList(Food food);
        void  sliderFoodList(Food food);
        void showError(String error);
    }
    interface  Model{
        interface ModelResponse{
            void  getFoodsResponse(String restaurant_id);
            void getSliderImages(String restaurant_id);
        }
        void foodList(Food food);
        void sliderFoodList(Food food);
        void foodResponseError(String error);

    }
    interface Presenter{
        void getFood(String restaurant_id);
        void  getSliderImage(String restaurant_id);
        void destroyView();
    }
}
