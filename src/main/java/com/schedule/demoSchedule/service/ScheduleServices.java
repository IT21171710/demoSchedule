package com.schedule.demoSchedule.service;

import com.schedule.demoSchedule.model.Schedule;
import com.schedule.demoSchedule.repository.ScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ScheduleServices {

    @Autowired
    private ScheduleRepo repo;



    public void saveorUpdate(Schedule schedules) {
        repo.save(schedules);
    }

    public Iterable<Schedule>  ListAll() {
        return this.repo.findAll();
    }

    public void deleteSchedule(String id) {
        repo.deleteById(id);
    }

    public Schedule getScheduleByID(String scheduleid) {
        return repo.findById(scheduleid).get();
    }
}
