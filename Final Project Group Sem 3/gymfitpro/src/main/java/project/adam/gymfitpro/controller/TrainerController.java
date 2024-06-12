package project.adam.gymfitpro.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import project.adam.gymfitpro.entity.TrainerEntity;
import project.adam.gymfitpro.service.TrainerService;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    @GetMapping
    public List<TrainerEntity> getAllTrainers() {
        return trainerService.getAllTrainers();
    }

    @GetMapping("/{id}")
    public TrainerEntity getTrainerById(@PathVariable Integer id) {
        return trainerService.getTrainerById(id);
    }

    @PostMapping
    public TrainerEntity createTrainer(@RequestBody TrainerEntity trainer) {
        return trainerService.createTrainer(trainer);
    }

    @PutMapping("/{id}")
    public TrainerEntity updateTrainer(@PathVariable Integer id, @RequestBody TrainerEntity trainer) {
        return trainerService.updateTrainer(id, trainer);
    }

    @DeleteMapping("/{id}")
    public void deleteTrainer(@PathVariable Integer id) {
        trainerService.deleteTrainer(id);
    }
}