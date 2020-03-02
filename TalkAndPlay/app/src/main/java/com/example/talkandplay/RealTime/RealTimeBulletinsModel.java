package com.example.talkandplay.RealTime;

import android.widget.ImageView;

public class RealTimeBulletinsModel {
    private ImageView face_imageView;
    private String name_textView, date_textView, title_textView, contents_textView,
            bulletin_board_name_textView, thumb_up_number_textView, thumb_down_number_textView;

    public RealTimeBulletinsModel(String name_textView, String date_textView,
                                  String title_textView, String contents_textView, String bulletin_board_name_textView,
                                  String thumb_up_number_textView, String thumb_down_number_textView) {
        this.name_textView = name_textView;
        this.date_textView = date_textView;
        this.title_textView = title_textView;
        this.contents_textView = contents_textView;
        this.bulletin_board_name_textView = bulletin_board_name_textView;
        this.thumb_up_number_textView = thumb_up_number_textView;
        this.thumb_down_number_textView = thumb_down_number_textView;
    }

    public RealTimeBulletinsModel(ImageView face_imageView, String name_textView, String date_textView,
                                  String title_textView, String contents_textView, String bulletin_board_name_textView,
                                  String thumb_up_number_textView, String thumb_down_number_textView) {
        this.face_imageView = face_imageView;
        this.name_textView = name_textView;
        this.date_textView = date_textView;
        this.title_textView = title_textView;
        this.contents_textView = contents_textView;
        this.bulletin_board_name_textView = bulletin_board_name_textView;
        this.thumb_up_number_textView = thumb_up_number_textView;
        this.thumb_down_number_textView = thumb_down_number_textView;
    }

    public ImageView getFace_imageView() {
        return face_imageView;
    }

    public void setFace_imageView(ImageView face_imageView) {
        this.face_imageView = face_imageView;
    }

    public String getName_textView() {
        return name_textView;
    }

    public void setName_textView(String name_textView) {
        this.name_textView = name_textView;
    }

    public String getDate_textView() {
        return date_textView;
    }

    public void setDate_textView(String date_textView) {
        this.date_textView = date_textView;
    }

    public String getTitle_textView() {
        return title_textView;
    }

    public void setTitle_textView(String title_textView) {
        this.title_textView = title_textView;
    }

    public String getContents_textView() {
        return contents_textView;
    }

    public void setContents_textView(String contents_textView) {
        this.contents_textView = contents_textView;
    }

    public String getBulletin_board_name_textView() {
        return bulletin_board_name_textView;
    }

    public void setBulletin_board_name_textView(String bulletin_board_name_textView) {
        this.bulletin_board_name_textView = bulletin_board_name_textView;
    }

    public String getThumb_up_number_textView() {
        return thumb_up_number_textView;
    }

    public void setThumb_up_number_textView(String thumb_up_number_textView) {
        this.thumb_up_number_textView = thumb_up_number_textView;
    }

    public String getThumb_down_number_textView() {
        return thumb_down_number_textView;
    }

    public void setThumb_down_number_textView(String thumb_down_number_textView) {
        this.thumb_down_number_textView = thumb_down_number_textView;
    }
}
