package org.example;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SweetShop sweetShop = new SweetShop();
        sweetShop.addItems();
        print();
        int choice = scanner.nextInt();
        sweetShop.show(choice);
    }


    private static void print() {
        System.out.println("Welcome to Sweet Shop\n" +
                "Press 1 to see chocolates\n" +
                "Press 2 to see candies\n" +
                "Press 3 to exit");
    }
}
