package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class CatDrinks {
    List<RefreshmentItem> drinkslist = new ArrayList<>();
    public CatDrinks() {
        drinkslist.add(new PepsiDrink());
        drinkslist.add(new CokeDrink());
    }
}
