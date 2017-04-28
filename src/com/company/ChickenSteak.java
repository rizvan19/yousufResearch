package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class ChickenSteak implements FoodItem {
    @Override
    public String foodName() {
        return "Chicken Steak";
    }

    @Override
    public int foodPrice() {
        return 600;
    }
}
