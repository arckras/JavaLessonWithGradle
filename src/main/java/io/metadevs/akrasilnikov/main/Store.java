package io.metadevs.akrasilnikov.main;

import java.util.ArrayList;

public class Store {

    ArrayList<Product> products = new ArrayList<>();

//region getters/setters
    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product getProduct(int i) {
        return products.get(i);
    }

    public void addProduct(Product product) {
        products.add(product);
    }
//endregion
}
