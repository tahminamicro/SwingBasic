
package com.coderbd.pojo;


public class Product {
    private int productID;
    private String productName;
    private int stock;
    private double price;

    public Product() {
    }

    public Product(int productID) {
        this.productID = productID;
    }

    public Product(int productID, String productName, int stock, double price) {
        this.productID = productID;
        this.productName = productName;
        this.stock = stock;
        this.price = price;
    }

    public Product(String productName, int stock, double price) {
        this.productName = productName;
        this.stock = stock;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
