package com.schedule.demoSchedule.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "schedules")

public class Schedule {
    @Id
    private String _id;
    private String classname;
    private String time;
    private String link;

    public Schedule(String _id, String classname, String time, String link) {
        this._id = _id;
        this.classname = classname;
        this.time = time;
        this.link = link;
    }

    public Schedule() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "_id='" + _id + '\'' +
                ", classname='" + classname + '\'' +
                ", time='" + time + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}

