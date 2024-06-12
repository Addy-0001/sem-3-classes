package project.adam.gymfitpro.service;

import java.util.List;
import project.adam.gymfitpro.entity.WorkoutEntity;

public interface WorkoutService {
    List<WorkoutEntity> getAllWorkouts();
    WorkoutEntity getWorkoutById(Integer id);
    WorkoutEntity createWorkout(WorkoutEntity workout);
    WorkoutEntity updateWorkout(Integer id, WorkoutEntity workout);
    void deleteWorkout(Integer id);
}