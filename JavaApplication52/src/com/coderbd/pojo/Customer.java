
package com.coderbd.pojo;


public class Customer {
    private int customerId;
    private String customerName;
    private String address;

    public Customer() {
    }

    public Customer(int customerId) {
        this.customerId = customerId;
    }
    

    public Customer(int customerId, String customerName, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }
}
