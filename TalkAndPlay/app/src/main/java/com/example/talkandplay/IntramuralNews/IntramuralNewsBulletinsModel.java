package com.example.talkandplay.IntramuralNews;

import android.widget.ImageView;

public class IntramuralNewsBulletinsModel {
    private ImageView trade_mark_imageView;
    private String group_name_textView, intramural_news_date_textView, intramural_news_contents_textView, intramural_news_group_name_textView;
    private int thumb_up_number_textView, thumb_down_number_textView;

    public IntramuralNewsBulletinsModel(String group_name_textView, String intramural_news_date_textView,
                                        String intramural_news_contents_textView, String intramural_news_group_name_textView,
                                        int thumb_up_number_textView, int thumb_down_number_textView) {
        this.group_name_textView = group_name_textView;
        this.intramural_news_date_textView = intramural_news_date_textView;
        this.intramural_news_contents_textView = intramural_news_contents_textView;
        this.intramural_news_group_name_textView = intramural_news_group_name_textView;
        this.thumb_up_number_textView = thumb_up_number_textView;
        this.thumb_down_number_textView = thumb_down_number_textView;
    }

    public ImageView getTrade_mark_imageView() {
        return trade_mark_imageView;
    }

    public void setTrade_mark_imageView(ImageView trade_mark_imageView) {
        this.trade_mark_imageView = trade_mark_imageView;
    }

    public String getGroup_name_textView() {
        return group_name_textView;
    }

    public void setGroup_name_textView(String group_name_textView) {
        this.group_name_textView = group_name_textView;
    }

    public String getIntramural_news_date_textView() {
        return intramural_news_date_textView;
    }

    public void setIntramural_news_date_textView(String intramural_news_date_textView) {
        this.intramural_news_date_textView = intramural_news_date_textView;
    }

    public String getIntramural_news_contents_textView() {
        return intramural_news_contents_textView;
    }

    public void setIntramural_news_contents_textView(String intramural_news_contents_textView) {
        this.intramural_news_contents_textView = intramural_news_contents_textView;
    }

    public String getIntramural_news_group_name_textView() {
        return intramural_news_group_name_textView;
    }

    public void setIntramural_news_group_name_textView(String intramural_news_group_name_textView) {
        this.intramural_news_group_name_textView = intramural_news_group_name_textView;
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
