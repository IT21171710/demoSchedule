package com.schedule.demoSchedule.repository;

import com.schedule.demoSchedule.model.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScheduleRepo extends MongoRepository<Schedule,String> {
}
