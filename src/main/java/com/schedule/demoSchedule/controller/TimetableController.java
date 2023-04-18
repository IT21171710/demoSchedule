package com.schedule.demoSchedule.controller;

import com.schedule.demoSchedule.model.Timetable;
import com.schedule.demoSchedule.repository.TimetableRepository;
import com.schedule.demoSchedule.service.TimetableRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TimetableController {

    private final TimetableRepository timetableRepository;

    public TimetableController(TimetableRepository timetableRepository) {
        this.timetableRepository = timetableRepository;
    }

    @GetMapping("/timetable")
    public ResponseEntity<List<Timetable>> getAllTimetables(){
        return ResponseEntity.ok(this.timetableRepository.findAll());

    }

    @PostMapping("/timetable")
    public ResponseEntity<Timetable> createTimetable(@RequestBody TimetableRequest timetableRequest){

        Timetable timetable=new Timetable();
        timetable.setGrade(timetableRequest.getGrade());
        timetable.setT_name(timetableRequest.getT_name());

        return ResponseEntity.status(201).body(this.timetableRepository.save(timetable));

    }
}
