package org.collections.map.search;

public class App {
    public static void main(String[] args) {
        ProductStock productStock = new ProductStock();
        productStock.showProducts();

        productStock.addProduct(1,"Tablet",50,10);
        productStock.addProduct(2,"Smartphone",100,5);
        productStock.addProduct(3,"NoteBook Asus",1500,2);
        productStock.showProducts();

        System.out.println(productStock.getProductMoreExpensive());
        System.out.println(productStock.calcTotalValueStock());

    }
}
