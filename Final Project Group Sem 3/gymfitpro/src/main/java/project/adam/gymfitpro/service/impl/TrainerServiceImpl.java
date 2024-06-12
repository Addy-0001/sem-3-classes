package project.adam.gymfitpro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import project.adam.gymfitpro.entity.TrainerEntity;
import project.adam.gymfitpro.repository.TrainerRepository;
import project.adam.gymfitpro.service.TrainerService;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

    @Override
    public List<TrainerEntity> getAllTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public TrainerEntity getTrainerById(Integer id) {
        Optional<TrainerEntity> trainer = trainerRepository.findById(id);
        return trainer.orElse(null);
    }

    @Override
    public TrainerEntity createTrainer(TrainerEntity trainer) {
        return trainerRepository.save(trainer);
    }

    @Override
    public TrainerEntity updateTrainer(Integer id, TrainerEntity trainer) {
        if (trainerRepository.existsById(id)) {
            trainer.setId(id);
            return trainerRepository.save(trainer);
        }
        return null;
    }

    @Override
    public void deleteTrainer(Integer id) {
        trainerRepository.deleteById(id);
    }
}
