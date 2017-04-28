package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class BeefBurger implements FoodItem {
    @Override
    public String foodName() {
        return "Beef Burger";
    }

    @Override
    public int foodPrice() {
        return 200;
    }
}
