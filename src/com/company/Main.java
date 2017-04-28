package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            System.out.println("X----------------------------------------------------------X");
            menu.displayMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Option: ");
            String input = scanner.nextLine();
            Boolean flag = menu.orderSelection(input);
            if(flag == true) {
                break;
            }
            // write your code here
        }
    }
}
