package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.WorkoutEntity;

public interface WorkoutRepository extends JpaRepository<WorkoutEntity, Integer> {

}
