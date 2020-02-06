package org.example;

import org.example.sweet.Sweet;

import java.util.*;

public class Gift {
    private SortedMap<Sweet, Integer> items;
    private double price;
    private double weight;

    private Gift() {
        items = new TreeMap<>(Comparator.comparing(Sweet::getName));
        price = 0;
    }

    public SortedMap<Sweet, Integer> getItems() {
        return items;
    }

    public void addItem(int choice, int type, int quantity) {
        Sweet sweet = GiftShop.sweets.get(choice - 1).get(type - 1);
        if (items.containsKey(sweet)) {
            items.put(sweet, items.get(sweet) + quantity);
        } else {
            items.put(sweet, quantity);
        }
        price += sweet.getPrice() * quantity;
        weight += sweet.getWeight() * quantity;
    }

    public static Gift createGift() {
        return new Gift();
    }

    public void show() {
        for (Map.Entry<Sweet, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " Quantity: " + entry.getValue());
        }
        System.out.println("Total Price: " + price + " Total Weight: " + weight);
    }


    public void sort(int param) throws Exception {
        SortedMap<Sweet, Integer> temp = null;
        switch (param) {
            case 1:
                temp = new TreeMap<>(Comparator.comparing(Sweet::getName));
                break;
            case 2:
                temp = new TreeMap<>((e1, e2) -> {
                    if (e1.getPrice() == e2.getPrice()) {
                        return e1.getName().compareTo(e2.getName());
                    } else {
                        return e1.getPrice() > e2.getPrice() ? 1 : -1;
                    }
                });
                break;
            case 3:
                temp = new TreeMap<>((e1, e2) -> {
                    if (e1.getWeight() == e2.getWeight()) {
                        return e1.getName().compareTo(e2.getName());
                    } else {
                        return e1.getWeight() > e2.getWeight() ? 1 : -1;
                    }
                });
                break;
            default:
                throw new Exception("Invalid Input");
        }

        temp.putAll(items);
        items = temp;
    }

}
