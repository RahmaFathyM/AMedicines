package com.example.mymedicines;

public class item {
    int img_item;
    String name_item;

    public item(int img_item, String name_item) {
       this.img_item = img_item;
        this.name_item = name_item;
    }

    public int getImg_item() {
        return img_item;
    }

    public void setImg_item(int img_item) {
        this.img_item = img_item;
    }

    public String getName_item() {
        return name_item;
    }

    public void setName_item(String name_item) {
        this.name_item = name_item;
    }
}
