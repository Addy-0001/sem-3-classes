package project.adam.gymfitpro.service;

import java.util.List;

import project.adam.gymfitpro.entity.TrainerEntity;

public interface TrainerService {
    List<TrainerEntity> getAllTrainers();
    TrainerEntity getTrainerById(Integer id);
    TrainerEntity createTrainer(TrainerEntity trainer);
    TrainerEntity updateTrainer(Integer id, TrainerEntity trainer);
    void deleteTrainer(Integer id);
}