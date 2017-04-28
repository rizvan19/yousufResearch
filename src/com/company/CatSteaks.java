package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class CatSteaks {
    List<FoodItem> steaklist = new ArrayList<>();
    public CatSteaks() {
        steaklist.add(new ChickenSteak());
        steaklist.add(new BeefSteak());
    }
}
