package com.company;

/**
 * Created by Yousuf on 4/20/2017.
 */
public class GrilledBurger implements FoodItem {
    @Override
    public String foodName() {
        return "Grilled Burger";
    }

    @Override
    public int foodPrice() {
        return 300;
    }
}
