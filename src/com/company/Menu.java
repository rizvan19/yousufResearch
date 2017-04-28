package com.company;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Yousuf on 4/15/2017.
 */
public class Menu {
    String[] arr = new String[]{"BURGER", "CHINESE", "STEAK", "BIRYANI", "DRINKS", "Place your Order", "Edit Cart"};

    public void displayMenu() {
        System.out.println("0) Exit");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ") " + arr[i]);
        }
    }

    List<FoodItem> list;
    Scanner s1 = new Scanner(System.in);
    Cart cart = new Cart();
    public Boolean orderSelection(String inp) {
        if (inp.equals("0")){
            System.out.println("X----------------------------------------------------------X" + "\n");
            return true;
        }
        if (inp.equals("1")) {
            CatBurger burger = new CatBurger();
            list = burger.burgerlist;
            addingFoodItemCart(list);
            return false;
        } else if (inp.equals("2")) {
            CatChinese chinese = new CatChinese();
            list = chinese.chineselist;
            addingFoodItemCart(list);
            return false;
        } else if (inp.equals("3")) {
            CatSteaks steak = new CatSteaks();
            list = steak.steaklist;
            addingFoodItemCart(list);
            return false;
        } else if (inp.equals("4")) {
            CatBiryani biryani = new CatBiryani();
            list = biryani.biryanilist;
            addingFoodItemCart(list);
            return false;
        } else if (inp.equals("5")) {
            CatDrinks drink = new CatDrinks();
            List<RefreshmentItem> list = drink.drinkslist;
            addingRefreshmentItemCart(list);
            return false;
        } else if (inp.equals("6")) {
            cart.getPlacedOrder();
            cart.getTotalPrice();
            System.out.println("X----------------------------------------------------------X" + "\n");
            return true;
        } else if (inp.equals("7")) {
            cart.editOrder();
            System.out.println("X----------------------------------------------------------X" + "\n");
            return false;
        } else {
            System.out.println("Wrong Option");
            System.out.println("X----------------------------------------------------------X" + "\n");
            return false;
        }
    }
    public void addingFoodItemCart(List<FoodItem> list) {
        int count = 1;
        for (FoodItem item : list) {
            System.out.println(count + ") " + item.foodName()+ " " + item.foodPrice());
            count++;
        }
        System.out.print("Enter Option: ");
        int option = s1.nextInt();
        if (option <= list.size()) {
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }

            cart.addItem(list.get(option - 1).foodName(), list.get(option - 1).foodPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("X----------------------------------------------------------X" + "\n");
        }
        else {
            System.out.println("Wrong Option");
        }
    }
    public void addingRefreshmentItemCart(List<RefreshmentItem> list){
        int count = 1;
        for (RefreshmentItem item : list) {
            System.out.println(count + ") " + item.refreshmentName() + " " + item.refreshmentPrice());
            count++;
        }
        System.out.print("Enter Option: ");
        int option = s1.nextInt();
        if (option <= list.size()) {
            System.out.print("Enter Quantity: ");
            int quantity = s1.nextInt();
            if (quantity <= 0) {
                quantity = 1;
            }
            cart.addItem(list.get(option - 1).refreshmentName(), list.get(option - 1).refreshmentPrice(), quantity);
            System.out.println("Item Added to Cart");
            System.out.println("X----------------------------------------------------------X" + "\n");
        }
        else{
            System.out.println("Wrong option");
        }
    }
}
