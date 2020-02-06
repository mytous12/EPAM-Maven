package org.example;

import org.example.sweet.Sweet;
import org.example.sweet.candy.Candy;
import org.example.sweet.chocolate.Chocolate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GiftShop {
    static final List<Chocolate> chocolates = new ArrayList<>();
    static final List<Candy> candies = new ArrayList<>();
    static final List<List<? extends Sweet>> sweets = new ArrayList<>();

    public GiftShop() {
        sweets.add(chocolates);
        sweets.add(candies);
    }

    public void addChocolate(Chocolate chocolate) {
        chocolates.add(chocolate);
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public void sortChocolates() {
        chocolates.sort(Comparator.comparing(Sweet::getName));
    }

    public void sortCandies() {
        candies.sort(Comparator.comparing(Sweet::getName));
    }

    public void showChocolates() {
        for (int i = 0; i < chocolates.size(); i++) {
            System.out.println((i + 1) + " " + chocolates.get(i));
        }
    }

    public void showCandies() {
        for (int i = 0; i < candies.size(); i++) {
            System.out.println((i + 1) + " " + candies.get(i));
        }
    }
}
