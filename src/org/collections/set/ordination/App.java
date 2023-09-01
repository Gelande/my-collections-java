package org.collections.set.ordination;
public class App {
    public static void main(String[] args) {

        RegisterProducts registerProducts = new RegisterProducts();
        System.out.println(registerProducts.showProductsByName());

        registerProducts.addProduct("Produto 1",3,3.0,7);
        registerProducts.addProduct("Produto 2",2,2.0,5);
        registerProducts.addProduct("Produto 3",3,7.50,2);
        registerProducts.addProduct("Produto 4",1,8.0,1);
        System.out.println(registerProducts.showProductsByName());

        System.out.println(registerProducts.showProductsByName());
        System.out.println(registerProducts.showProductsByPrice());


    }
}
