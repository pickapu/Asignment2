package com.example.restaurantapp.dataclass;

public class OrderDetails {
    String name;
    String date ;
    int price;
    int orderId;
    int image;

    public OrderDetails(String name, String date, int price, int orderId, int image) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.orderId = orderId;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
