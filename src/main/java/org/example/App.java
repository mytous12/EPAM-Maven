package org.example;

import org.example.sweet.candy.Gum;
import org.example.sweet.candy.Tart;
import org.example.sweet.candy.Toffee;
import org.example.sweet.chocolate.DairyMilk;
import org.example.sweet.chocolate.FerreroRocher;
import org.example.sweet.chocolate.MilkyBar;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        GiftShop giftShop = populate();
        printGreeting();
        printManual();

        boolean quit = false;
        Gift gift = Gift.createGift();
        while (!quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    giftShop.showChocolates();
                    break;
                case 2:
                    giftShop.showCandies();
                    break;
            }

            if (choice != 0) {
                System.out.println("Press the number against the item, to add it");
                int type = scanner.nextInt();
                System.out.println("Enter Quantity");
                int quantity = scanner.nextInt();
                gift.addItem(choice, type, quantity);
                System.out.println("Item successfully added");
                printManual();
            }
        }

        sortInstructions();
        gift.sort(scanner.nextInt());
        gift.show();
        System.out.println("Exiting Program");
    }

    private static void printManual() {
        System.out.println("Press 1 to see chocolates\n" +
                "Press 2 to see candies\n" +
                "Press 0 to exit");
    }

    private static void printGreeting() {
        System.out.println("Welcome to Sweet Shop");
    }

    private static void sortInstructions() {
        System.out.println("Press 1 the sort the gift items by name\n" +
                "Press 2 the sort the gift items by price\n" +
                "Press 3 the sort the gift items by weight");
    }

    private static GiftShop populate() {
        GiftShop giftShop = new GiftShop();
        giftShop.addChocolate(new DairyMilk());
        giftShop.addChocolate(new FerreroRocher());
        giftShop.addChocolate(new MilkyBar());

        giftShop.sortChocolates();

        giftShop.addCandy(new Tart());
        giftShop.addCandy(new Gum());
        giftShop.addCandy(new Toffee());

        giftShop.sortCandies();

        return giftShop;
    }

}
