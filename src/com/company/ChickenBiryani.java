package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class ChickenBiryani implements FoodItem{
    @Override
    public String foodName() {
        return "Chicken Biryani";
    }

    @Override
    public int foodPrice() {
        return 120;
    }
}
