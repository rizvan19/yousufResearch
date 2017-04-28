package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class CatBiryani {
    List<FoodItem> biryanilist = new ArrayList<>();
    public CatBiryani(){
        biryanilist.add(new ChickenBiryani());
        biryanilist.add(new BeefBiryani());
        biryanilist.add(new FishBiryani());
    }
}
