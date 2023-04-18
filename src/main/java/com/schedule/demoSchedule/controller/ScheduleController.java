package com.schedule.demoSchedule.controller;

import com.schedule.demoSchedule.model.Schedule;
import com.schedule.demoSchedule.service.ScheduleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/schedule")

public class ScheduleController {

    @Autowired

    private ScheduleServices scheduleServices;
    @PostMapping(value = "/save")
    private String saveSchedule(@RequestBody Schedule schedules){

        scheduleServices.saveorUpdate(schedules);
        return schedules.get_id();

    }
    @GetMapping(value = "/getall")
    private Iterable<Schedule>getSchedules(){


        return scheduleServices.ListAll();

    }

    @PutMapping(value="/edit/{id}")
    private Schedule update(@RequestBody Schedule schedule,@PathVariable(name="id")String _id){
        schedule.set_id(_id);
        scheduleServices.saveorUpdate(schedule);
        return schedule;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteSchedule(@PathVariable("id")String _id){
        scheduleServices.deleteSchedule(_id);

    }

    @RequestMapping("/search/{id}")
    private Schedule getSchedules(@PathVariable(name="id")String scheduleid){
        return scheduleServices.getScheduleByID(scheduleid);
    }
}
