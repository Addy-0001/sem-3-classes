package project.adam.gymfitpro.service;

import java.util.List;
import project.adam.gymfitpro.entity.NotificationEntity;

public interface NotificationService {
    List<NotificationEntity> getAllNotifications();
    NotificationEntity getNotificationById(Integer id);
    NotificationEntity createNotification(NotificationEntity notification);
    NotificationEntity updateNotification(Integer id, NotificationEntity notification);
    void deleteNotification(Integer id);
}