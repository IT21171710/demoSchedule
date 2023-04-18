package com.schedule.demoSchedule.repository;

import com.schedule.demoSchedule.model.Timetable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimetableRepository extends MongoRepository <Timetable, String> {
}
