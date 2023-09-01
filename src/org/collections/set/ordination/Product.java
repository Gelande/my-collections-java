package org.collections.set.ordination;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {

    private String name;
    private long code;
    private double price;
    private int amount;

    public Product(String name, long code, double price, int amount) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getName());
    }

    public String getName() {
        return name;
    }

    public long getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    //Produto diferente será tratado unicamente pelo código
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getCode() == product.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}

class ComparatorByPrice implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
