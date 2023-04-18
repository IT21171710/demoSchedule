package com.schedule.demoSchedule.controller;

import com.schedule.demoSchedule.model.Announcement;
import com.schedule.demoSchedule.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/announcements")
@CrossOrigin

public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/all")
    public List<Announcement> getAnnouncements(){
       return announcementService.getAnnouncements();

    }

    @PostMapping("/insert")
    public Announcement insert(@RequestBody Announcement announcement){
        return announcementService.addAnnouncement(announcement);
    }

    @PutMapping ("/update/{id}")
    public Announcement update(@PathVariable int id,@RequestBody Announcement announcement){
        return announcementService.updateAnnouncement(id,announcement);


    }

    @DeleteMapping("/delete/{id}")
    public Announcement delete(@PathVariable int id){
        return announcementService.deleteAnnouncement(id);

    }


}
