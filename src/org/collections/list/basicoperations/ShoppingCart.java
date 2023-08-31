package org.collections.list.basicoperations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price, int amout) {
        Item item = new Item(name, price, amout);
        items.add(item);
    }

    public void displayCart() {
        System.out.println(items);
    }

    public double calcValueCart() {
        double value = 0;
        for (Item i: items) {
            value += i.getAmount() * i.getPrice();
        }
        return value;
    }
    public void removeItem(String name) {
        List<Item> removeItems = new ArrayList<>();
        if (!items.isEmpty()) {
            for (Item i : items) {
                if (i.getName().equalsIgnoreCase(name)) {
                    removeItems.add(i);
                }
            }
            items.removeAll(removeItems);
        } else {
            System.out.println("Lista vazia.");
        }
    }
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("Calça", 73.0, 1);
        sc.addItem("Blusa", 22.0, 1);
        sc.addItem("Jaqueta", 100.0, 1);
        sc.removeItem("Blusa");
        sc.displayCart();
        double value = sc.calcValueCart();
        System.out.println("Valor total dos itens: " + value);
    }
}
