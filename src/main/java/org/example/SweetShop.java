package org.example;

import org.example.sweet.Sweet;
import org.example.sweet.candy.Candy;
import org.example.sweet.candy.Gum;
import org.example.sweet.candy.Tart;
import org.example.sweet.candy.Toffee;
import org.example.sweet.chocolate.Chocolate;
import org.example.sweet.chocolate.DairyMilk;
import org.example.sweet.chocolate.FerreroRocher;
import org.example.sweet.chocolate.MilkyBar;

import java.util.ArrayList;
import java.util.List;

public class SweetShop {
    private static final List<Sweet> list = new ArrayList<>();

    public void addItems() {
        list.add(new MilkyBar());
        list.add(new DairyMilk());
        list.add(new FerreroRocher());
        list.add(new Gum());
        list.add(new Tart());
        list.add(new Toffee());
    }

    private void enlistChocolates() {
        for (Sweet sweet : list) {
            if (sweet instanceof Chocolate) {
                System.out.println(sweet);
            }
        }
    }

    private void enlistCandies() {
        for (Sweet sweet : list) {
            if (sweet instanceof Candy) {
                System.out.println(sweet);
            }
        }
    }

    public void show(int choice) {
        switch (choice) {
            case 1:
                enlistChocolates();
                break;
            case 2:
                enlistCandies();
                break;
            case 3:
                System.out.println("Exiting Program");
                break;
        }
    }
}
