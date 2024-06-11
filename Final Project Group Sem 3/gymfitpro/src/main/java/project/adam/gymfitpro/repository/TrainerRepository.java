package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.adam.gymfitpro.entity.TrainerEntity;

public interface TrainerRepository extends JpaRepository<TrainerEntity, Integer> {

}
