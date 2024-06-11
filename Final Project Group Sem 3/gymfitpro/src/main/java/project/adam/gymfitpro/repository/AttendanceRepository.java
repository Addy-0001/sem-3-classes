package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.AttendanceEntity;
import project.adam.gymfitpro.entity.AttendanceId;

public interface AttendanceRepository extends JpaRepository<AttendanceEntity, AttendanceId> {

}
