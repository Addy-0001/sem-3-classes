package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.AttendanceEntity;

public interface AttendanceRepository extends JpaRepository<AttendanceEntity, Integer> {

}
