package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class BeefSteak implements FoodItem {
    @Override
    public String foodName() {
        return "Beef Steak";
    }

    @Override
    public int foodPrice() {
        return 700;
    }
}
