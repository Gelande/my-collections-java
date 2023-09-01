package org.collections.set.ordination;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegisterProducts {

    private Set<Product> productSet;

    public RegisterProducts() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(String name, long code, double price, int amount) {
        productSet.add(new Product(name, code, price, amount));
    }

    //Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
    public Set<Product> showProductsByName() {
        Set<Product> productsByName = new TreeSet<>(productSet);
        return productsByName;
    }

    //exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.
    public Set<Product> showProductsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
        productsByPrice.addAll(productSet);
        return productsByPrice;
    }

}
