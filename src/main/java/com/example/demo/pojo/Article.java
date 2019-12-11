package com.example.demo.pojo;



public class Article {

    private int id;
    private String title;
    private String summary;
    private String createTime;

    public Article() {
    }

    public Article(int id, String title, String summary, String createTime) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
