package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.NotificationEntity;
import project.adam.gymfitpro.entity.NotificationId;

public interface NotificationRepository extends JpaRepository<NotificationEntity, NotificationId> {

}
