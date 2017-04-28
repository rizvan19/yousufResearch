package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class ChickenBurger implements FoodItem {
    @Override
    public String foodName() {
        return "Chicken Burger";
    }

    @Override
    public int foodPrice() {
        return 220;
    }
}
