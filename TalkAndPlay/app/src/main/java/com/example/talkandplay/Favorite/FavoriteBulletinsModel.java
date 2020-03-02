package com.example.talkandplay.Favorite;

import android.widget.ImageView;

public class FavoriteBulletinsModel {
    private String name;
    private String contents;
    private ImageView imageView;

    public FavoriteBulletinsModel(String name, String contents) {
        this.name = name;
        this.contents = contents;
    }

    public FavoriteBulletinsModel(String name, String contents, ImageView imageView) {
        this.name = name;
        this.contents = contents;
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
