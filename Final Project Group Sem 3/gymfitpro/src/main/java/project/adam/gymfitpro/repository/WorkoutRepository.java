package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.WorkoutEntity;
import project.adam.gymfitpro.entity.WorkoutId;

public interface WorkoutRepository extends JpaRepository<WorkoutEntity, WorkoutId> {

}
