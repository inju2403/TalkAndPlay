package com.example.talkandplay.Hot;

public class HotBulletinsModel {
    private String hot_contents_textView, hot_date_textView;
    private int thumb_up_number_textView, thumb_down_number_textView;

    public HotBulletinsModel(String hot_contents_textView, String hot_date_textView, int thumb_up_number_textView, int thumb_down_number_textView) {
        this.hot_contents_textView = hot_contents_textView;
        this.hot_date_textView = hot_date_textView;
        this.thumb_up_number_textView = thumb_up_number_textView;
        this.thumb_down_number_textView = thumb_down_number_textView;
    }

    public String getHot_contents_textView() {
        return hot_contents_textView;
    }

    public void setHot_contents_textView(String hot_contents_textView) {
        this.hot_contents_textView = hot_contents_textView;
    }

    public String getHot_date_textView() {
        return hot_date_textView;
    }

    public void setHot_date_textView(String hot_date_textView) {
        this.hot_date_textView = hot_date_textView;
    }

    public int getThumb_up_number_textView() {
        return thumb_up_number_textView;
    }

    public void setThumb_up_number_textView(int thumb_up_number_textView) {
        this.thumb_up_number_textView = thumb_up_number_textView;
    }

    public int getThumb_down_number_textView() {
        return thumb_down_number_textView;
    }

    public void setThumb_down_number_textView(int thumb_down_number_textView) {
        this.thumb_down_number_textView = thumb_down_number_textView;
    }
}
