package project.adam.gymfitpro.service;

import java.util.List;
import project.adam.gymfitpro.entity.NotificationEntity;

public interface NotificationService {
    List<NotificationEntity> getAllNotifications();

    NotificationEntity getNotificationById(String id);

    NotificationEntity createNotification(NotificationEntity notification);

    NotificationEntity updateNotification(String id, NotificationEntity notification);

    void deleteNotification(String id);
}