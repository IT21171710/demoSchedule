package com.schedule.demoSchedule.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data


@Document("timetables")


public class Timetable {
    @Id
    private String id;
    private String grade;
    private String t_name;

    public Timetable() {
    }

    public Timetable(String grade,String t_name){
        this.grade=grade;
        this.t_name=t_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}
