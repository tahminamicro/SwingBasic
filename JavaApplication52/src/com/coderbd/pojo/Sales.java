
package com.coderbd.pojo;


public class Sales {
    private int salesNo;
    private Customer customerId;
    private Product productID;
    private int quantity;
    private double price;

    public Sales(Product productID) {
        this.productID = productID;
    }

    public Sales(Customer customerId) {
        this.customerId = customerId;
    }

    public Sales() {
    }

    public Sales(int salesNo, Customer customerId, Product productID, int quantity, double price) {
        this.salesNo = salesNo;
        this.customerId = customerId;
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
    }

    public void setSalesNo(int salesNo) {
        this.salesNo = salesNo;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSalesNo() {
        return salesNo;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public Product getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    

    
}
