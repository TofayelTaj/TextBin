package com.practice.TextBin.Entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Past {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String text;
    private int timeOutInMin;
    private String link;


    public long getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getTimeOutInMin() {
        return timeOutInMin;
    }

    public void setTimeOutInMin(int timeOutInMin) {
        this.timeOutInMin = timeOutInMin;
    }

    @Override
    public String toString() {
        return "Past{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", timeOutInMin=" + timeOutInMin +
                ", link='" + link + '\'' +
                '}';
    }
}
