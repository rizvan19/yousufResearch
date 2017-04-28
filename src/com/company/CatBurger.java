package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class CatBurger {
    List<FoodItem> burgerlist = new ArrayList<>();

    public CatBurger() {
        burgerlist.add(new ChickenBurger());
        burgerlist.add(new BeefBurger());
        burgerlist.add(new GrilledBurger());

    }
}
