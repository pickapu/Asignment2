package com.example.restaurantapp.dataclass;

import android.os.Parcel;
import android.os.Parcelable;

public class OrderDetails implements Parcelable {
    String name;
    String date;
    int price;
    String orderId;
    int total;
    int noOfOrder;
    public OrderDetails(){

    }

    protected OrderDetails(Parcel in) {
        name = in.readString();
       // date = in.readString();
        price = in.readInt();
      //  orderId = in.readString();
      //  total = in.readInt();
        noOfOrder = in.readInt();
    }

    public OrderDetails(String name, String date, int price, String orderId, int total, int noOfOrder) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.orderId = orderId;
        this.total = total;
        this.noOfOrder = noOfOrder;
    }

    public OrderDetails(String name, int price, int noOfOrder) {
        this.name = name;
        this.price = price;
        this.noOfOrder = noOfOrder;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(date);
        dest.writeInt(price);
        dest.writeString(orderId);
        dest.writeInt(total);
        dest.writeInt(noOfOrder);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<OrderDetails> CREATOR = new Creator<OrderDetails>() {
        @Override
        public OrderDetails createFromParcel(Parcel in) {
            return new OrderDetails(in);
        }

        @Override
        public OrderDetails[] newArray(int size) {
            return new OrderDetails[size];
        }
    };

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNoOfOrder() {
        return noOfOrder;
    }

    public void setNoOfOrder(int noOfOrder) {
        this.noOfOrder = noOfOrder;
    }
}
