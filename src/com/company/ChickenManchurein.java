package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class ChickenManchurein implements FoodItem {
    @Override
    public String foodName() {
        return "Chicken Manchurein";
    }

    @Override
    public int foodPrice() {
        return 550;
    }
}
