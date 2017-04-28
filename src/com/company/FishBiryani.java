package com.company;

/**
 * Created by Yousuf on 4/24/2017.
 */
public class FishBiryani implements FoodItem {
    @Override
    public String foodName() {
        return "Fish Biryani";
    }

    @Override
    public int foodPrice() {
        return 200;
    }
}
