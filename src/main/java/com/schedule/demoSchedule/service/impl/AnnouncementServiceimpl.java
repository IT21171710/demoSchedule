package com.schedule.demoSchedule.service.impl;

import com.schedule.demoSchedule.model.Announcement;
import com.schedule.demoSchedule.repository.AnnouncementRepo;
import com.schedule.demoSchedule.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AnnouncementServiceimpl implements AnnouncementService {
    @Autowired
    private AnnouncementRepo announcementRepo;
    @Override
    public List<Announcement> getAnnouncements() {
        return announcementRepo.findAll();
    }

    @Override
    public Announcement addAnnouncement(Announcement announcement) {
        return announcementRepo.save(announcement);
    }

    @Override
    public Announcement deleteAnnouncement(int id) {
        Announcement announcement=announcementRepo.findById(id).get();
        announcementRepo.delete(announcement);
        return announcement;
    }

    @Override
    public Announcement updateAnnouncement(int id, Announcement announcement) {

        Announcement announcementVar=announcementRepo.findById(id).get();
        announcementVar.setTopic(announcement.getTopic());
        announcementVar.setDescription(announcement.getDescription());
        announcementRepo.save(announcementVar);
        return announcementVar;

    }
}
