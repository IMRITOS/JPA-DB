package com.psuti.Tepsurkaev.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(nullable = false, length = 25,name = "shop_name")
    private String shopName;
    @Column(nullable = false, length = 25,name = "product_name")
    private String productName;
    @Column(nullable = false, length = 10,name = "count")
    private int count;
    @Column(nullable = false, length = 10,name = "price")
    private int price;
    @Column(nullable = false, length = 10,name = "cost")
    private int cost;

    public String getShopName() {
        return shopName;
    }

    public String getProductName() {
        return productName;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public int getCost() {
        return cost;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
