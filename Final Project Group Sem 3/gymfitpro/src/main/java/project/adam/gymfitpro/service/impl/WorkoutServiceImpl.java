package project.adam.gymfitpro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.adam.gymfitpro.entity.WorkoutEntity;
import project.adam.gymfitpro.repository.WorkoutRepository;
import project.adam.gymfitpro.service.WorkoutService;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Override
    public List<WorkoutEntity> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    @Override
    public WorkoutEntity getWorkoutById(Integer id) {
        Optional<WorkoutEntity> workout = workoutRepository.findById(id);
        return workout.orElse(null);
    }

    @Override
    public WorkoutEntity createWorkout(WorkoutEntity workout) {
        return workoutRepository.save(workout);
    }

    @Override
    public WorkoutEntity updateWorkout(Integer id, WorkoutEntity workout) {
        if (workoutRepository.existsById(id)) {
            workout.setId(id);
            return workoutRepository.save(workout);
        }
        return null;
    }

    @Override
    public void deleteWorkout(Integer id) {
        workoutRepository.deleteById(id);
    }
}