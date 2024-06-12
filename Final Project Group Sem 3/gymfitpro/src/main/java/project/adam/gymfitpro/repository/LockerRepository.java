package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.LockerEntity;

public interface LockerRepository extends JpaRepository<LockerEntity, Integer> {
    
}
