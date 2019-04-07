/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

import java.sql.Date;

/**
 *
 * @author User
 */
public class Sales {
    private int id;
    private String productName;
    private String productCode;
    private int qty;
    private double unitPrice;
    private double totalPrice;
    private Date salesDate;
    private Product product;

    public Sales(String productName, String productCode, int qty, double unitPrice, double totalPrice, Date salesDate, Product product) {
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salesDate = salesDate;
        this.product = product;
    }

    public Sales(int id) {
        this.id = id;
    }

    public Sales(int id, String productName, String productCode, int qty, double unitPrice, double totalPrice, Date salesDate, Product product) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salesDate = salesDate;
        this.product = product;
    }

    public Sales() {
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    

}
