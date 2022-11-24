package com.mkrlabs.restraw.ui.home;

import com.mkrlabs.restraw.model.Food;

public class HomePresenter implements HomeContract.Presenter,HomeContract.Model{

    private HomeContract.View view;
    private HomeModel model;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
        model = new HomeModel(this);
    }
    @Override
    public void getFood(String restaurant_id) {

        if (view !=null){
            view.showLoading();
            model.getFoodsResponse(restaurant_id);
        }
    }

    @Override
    public void destroyView() {
            view =null;
    }

    @Override
    public void foodList(Food food) {
        if (view!=null){
            view.hideLoading();
            view.foodList(food);
        }

    }

    @Override
    public void sliderFoodList(Food food) {
        if (view!=null){
            view.hideLoading();
            view.sliderFoodList(food);
        }
    }

    @Override
    public void foodResponseError(String error) {
        view.showError(error);

    }

    @Override
    public void getSliderImage(String restaurant_id) {
        if (view !=null){
            view.showLoading();
            model.getSliderImages(restaurant_id);
        }

    }


}
