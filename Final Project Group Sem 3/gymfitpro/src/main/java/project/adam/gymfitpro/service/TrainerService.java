package project.adam.gymfitpro.service;

import java.util.List;

import project.adam.gymfitpro.entity.TrainerEntity;

public interface TrainerService {
    List<TrainerEntity> getAllTrainers();

    TrainerEntity getTrainerById(String id);

    TrainerEntity createTrainer(TrainerEntity trainer);

    TrainerEntity updateTrainer(String id, TrainerEntity trainer);

    void deleteTrainer(String id);
}