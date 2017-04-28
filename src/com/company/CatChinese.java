package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class CatChinese {
    List<FoodItem> chineselist = new ArrayList<>();
    public CatChinese() {
        chineselist.add(new ChickenManchurein());
        chineselist.add(new ChickenChowmein());
    }
}
