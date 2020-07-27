package pl.adamboguszewski.transactionservice.application;

import java.util.ArrayList;
import java.util.List;

// [TODO]: Imagine you make a transaction in the shop or somewhere. Create transaction model class which will represent every information needed (for example list of products)
public class Transaction {

    private final List<Product> products;

    private double totalPrice;

    private final String id;

    public Transaction(List<Product> products, String id) {
        this.id = id;
        this.products = new ArrayList<>();
        for(Product product : products) {
            this.products.add(product);
            totalPrice += product.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getId() {
        return id;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
    }
}
