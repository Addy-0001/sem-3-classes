package project.adam.gymfitpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import project.adam.gymfitpro.entity.WorkoutEntity;
import project.adam.gymfitpro.service.WorkoutService;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @GetMapping
    public List<WorkoutEntity> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/{id}")
    public WorkoutEntity getWorkoutById(@PathVariable Integer id) {
        return workoutService.getWorkoutById(id);
    }

    @PostMapping
    public WorkoutEntity createWorkout(@RequestBody WorkoutEntity workout) {
        return workoutService.createWorkout(workout);
    }

    @PutMapping("/{id}")
    public WorkoutEntity updateWorkout(@PathVariable Integer id, @RequestBody WorkoutEntity workout) {
        return workoutService.updateWorkout(id, workout);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkout(@PathVariable Integer id) {
        workoutService.deleteWorkout(id);
    }
}