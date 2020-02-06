package org.example.sweet;

import java.util.Comparator;
import java.util.List;

public abstract class Sweet implements Sort {
    private double price;
    private String name;
    private double weight;

    public Sweet(double price, String name, double weight) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void sort(List<Sweet> sweets, String param) {
        switch (param) {
            case "name":
                sweets.sort(Comparator.comparing(Sweet::getName));
                break;
            case "price":
                sweets.sort((e1, e2) -> {
                    if (e1.price == e2.price) {
                        return e1.name.compareTo(e2.name);
                    } else {
                        return e1.price > e2.price ? 1 : -1;
                    }
                });
                break;
            case "weight":
                sweets.sort((e1, e2) -> {
                    if (e1.weight == e2.weight) {
                        return e1.name.compareTo(e2.name);
                    } else {
                        return e1.weight > e2.weight ? 1 : -1;
                    }
                });
                break;
        }
    }

    @Override
    public String toString() {
        return name + " Weight:- " + weight + " Price:- " + price;
    }
}
