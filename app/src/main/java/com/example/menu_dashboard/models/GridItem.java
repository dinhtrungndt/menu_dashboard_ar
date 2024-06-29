package com.example.menu_dashboard.models;

public class GridItem {
    private int imageResId;
    private String text;

    public GridItem(int imageResId, String text) {
        this.imageResId = imageResId;
        this.text = text;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getText() {
        return text;
    }
}
