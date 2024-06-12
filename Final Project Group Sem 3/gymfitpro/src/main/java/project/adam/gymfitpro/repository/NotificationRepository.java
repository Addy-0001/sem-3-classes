package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.NotificationEntity;

public interface NotificationRepository extends JpaRepository<NotificationEntity, Integer> {

}
