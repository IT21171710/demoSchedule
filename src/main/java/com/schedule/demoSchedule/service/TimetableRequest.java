package com.schedule.demoSchedule.service;

public class TimetableRequest {

    private String grade;
    private String t_name;

    public TimetableRequest() {
    }

    public TimetableRequest(String grade,String t_name) {
        this.grade = grade;
        this.t_name=t_name;
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
