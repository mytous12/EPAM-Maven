package org.example.sweet;

import java.util.Comparator;
import java.util.List;

public abstract class Sweet {
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
    public String toString() {
        return name + " Weight: " + weight + " Price: " + price;
    }
}
