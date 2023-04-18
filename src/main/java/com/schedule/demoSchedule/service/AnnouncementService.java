package com.schedule.demoSchedule.service;

import com.schedule.demoSchedule.model.Announcement;

import java.util.List;

public interface AnnouncementService {

    public List<Announcement> getAnnouncements();

    public Announcement addAnnouncement(Announcement announcement);

    public Announcement deleteAnnouncement(int id);

    public Announcement updateAnnouncement(int id,Announcement announcement);

}
