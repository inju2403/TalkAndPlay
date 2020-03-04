package com.example.talkandplay.Question;

public class QuestionBulltinsModel {
    private String question_bulletins_title_textView, question_bulletins_contents_textView,
            question_bulletins_category_textView;

    public QuestionBulltinsModel(String question_bulletins_title_textView, String question_bulletins_contents_textView,
                                 String question_bulletins_category_textView) {
        this.question_bulletins_title_textView = question_bulletins_title_textView;
        this.question_bulletins_contents_textView = question_bulletins_contents_textView;
        this.question_bulletins_category_textView = question_bulletins_category_textView;
    }

    public String getQuestion_bulletins_title_textView() {
        return question_bulletins_title_textView;
    }

    public void setQuestion_bulletins_title_textView(String question_bulletins_title_textView) {
        this.question_bulletins_title_textView = question_bulletins_title_textView;
    }

    public String getQuestion_bulletins_contents_textView() {
        return question_bulletins_contents_textView;
    }

    public void setQuestion_bulletins_contents_textView(String question_bulletins_contents_textView) {
        this.question_bulletins_contents_textView = question_bulletins_contents_textView;
    }

    public String getQuestion_bulletins_category_textView() {
        return question_bulletins_category_textView;
    }

    public void setQuestion_bulletins_category_textView(String question_bulletins_category_textView) {
        this.question_bulletins_category_textView = question_bulletins_category_textView;
    }
}
