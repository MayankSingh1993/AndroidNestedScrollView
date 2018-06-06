package com.inducesmile.androidnestedscrollview;

public class ProductObject {
    private String imagePath;
    private String name;
    public ProductObject(String name, String imagePath) {
        this.imagePath = imagePath;
        this.name = name;
    }
    public String getImagePath() {
        return imagePath;
    }
    public String getName() {
        return name;
    }
}