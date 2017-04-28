package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class PepsiDrink implements RefreshmentItem {
    @Override
    public String refreshmentName() {
        return "Coke";
    }

    @Override
    public int refreshmentPrice() {
        return 35;
    }
}
