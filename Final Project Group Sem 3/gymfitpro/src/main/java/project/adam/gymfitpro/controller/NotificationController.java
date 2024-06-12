package project.adam.gymfitpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import project.adam.gymfitpro.entity.NotificationEntity;
import project.adam.gymfitpro.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<NotificationEntity> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @GetMapping("/{id}")
    public NotificationEntity getNotificationById(@PathVariable Integer id) {
        return notificationService.getNotificationById(id);
    }

    @PostMapping
    public NotificationEntity createNotification(@RequestBody NotificationEntity notification) {
        return notificationService.createNotification(notification);
    }

    @PutMapping("/{id}")
    public NotificationEntity updateNotification(@PathVariable Integer id, @RequestBody NotificationEntity notification) {
        return notificationService.updateNotification(id, notification);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Integer id) {
        notificationService.deleteNotification(id);
    }
}