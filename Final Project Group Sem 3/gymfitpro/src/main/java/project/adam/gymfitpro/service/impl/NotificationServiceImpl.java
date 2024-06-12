package project.adam.gymfitpro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.adam.gymfitpro.entity.NotificationEntity;
import project.adam.gymfitpro.repository.NotificationRepository;
import project.adam.gymfitpro.service.NotificationService;



@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public List<NotificationEntity> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @Override
    public NotificationEntity getNotificationById(Integer id) {
        Optional<NotificationEntity> notification = notificationRepository.findById(id);
        return notification.orElse(null);
    }

    @Override
    public NotificationEntity createNotification(NotificationEntity notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public NotificationEntity updateNotification(Integer id, NotificationEntity notification) {
        if (notificationRepository.existsById(id)) {
            notification.setId(id);
            return notificationRepository.save(notification);
        }
        return null;
    }

    @Override
    public void deleteNotification(Integer id) {
        notificationRepository.deleteById(id);
    }
}
