package org.collections.map.search;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {

    private Map<Long, Product> productMap;

    public ProductStock() {
        this.productMap = new HashMap<>();
    }

    //Adiciona um produto ao estoque
    public void addProduct(long code, String name, double price, int amount) {
        productMap.put(code, new Product(name, price,amount));
    }

    //Exibe todos os produtos, suas quantidades em estoque e preços.
    public void showProducts() {
        System.out.println(productMap);
    }

    //Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
    public double calcTotalValueStock() {
        double totalValueStock = 0;
        if (!productMap.isEmpty()) {
            //Apenas o valor importa nesse caso
            for (Product p: productMap.values()) {
                totalValueStock += p.getAmount() * p.getPrice();
            }
        }
        return totalValueStock;
    }
    //Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
    public Product getProductMoreExpensive() {
        Product productMoreExpensive = null;
        double morePrice = Double.MIN_VALUE;
        if (!productMap.isEmpty()) {
            for (Product p: productMap.values()) {
                if (p.getPrice() > morePrice) {
                    productMoreExpensive = p;
                }
            }
        }
        return productMoreExpensive;
    }
}
