package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class BeefBiryani implements FoodItem {
    @Override
    public String foodName() {
        return "Beef Biryani";
    }

    @Override
    public int foodPrice() {
        return 120;
    }
}
