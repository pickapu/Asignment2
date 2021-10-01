package com.example.restaurantapp.dataclass;

import android.os.Parcel;
import android.os.Parcelable;

public class Segments implements Parcelable {
   private  int image;
    private String name;
    private int price;

    public Segments(int image, String name,int price) {
        this.image = image;
        this.name = name;
        this.price=price;
    }

    protected Segments(Parcel in) {
        image = in.readInt();
        name = in.readString();
        price = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(name);
        dest.writeInt(price);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Segments> CREATOR = new Creator<Segments>() {
        @Override
        public Segments createFromParcel(Parcel in) {
            return new Segments(in);
        }

        @Override
        public Segments[] newArray(int size) {
            return new Segments[size];
        }
    };

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


