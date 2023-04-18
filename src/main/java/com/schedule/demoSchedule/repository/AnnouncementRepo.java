package com.schedule.demoSchedule.repository;

import com.schedule.demoSchedule.model.Announcement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnnouncementRepo extends MongoRepository<Announcement,Integer> {
}
