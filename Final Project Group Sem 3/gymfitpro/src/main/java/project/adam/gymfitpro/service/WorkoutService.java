package project.adam.gymfitpro.service;

import java.util.List;
import project.adam.gymfitpro.entity.WorkoutEntity;

public interface WorkoutService {
    List<WorkoutEntity> getAllWorkouts();

    WorkoutEntity getWorkoutById(String id);

    WorkoutEntity createWorkout(WorkoutEntity workout);

    WorkoutEntity updateWorkout(String id, WorkoutEntity workout);

    void deleteWorkout(String id);
}