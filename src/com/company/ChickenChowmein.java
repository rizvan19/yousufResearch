package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class ChickenChowmein implements FoodItem{
    @Override
    public String foodName() {
        return "Chicken Chowmein";
    }

    @Override
    public int foodPrice() {
        return 500;
    }
}
