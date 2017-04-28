package com.company;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class CokeDrink implements RefreshmentItem {
    @Override
    public String refreshmentName() {
        return "Pepsi";
    }

    @Override
    public int refreshmentPrice() {
        return 35;
    }
}
