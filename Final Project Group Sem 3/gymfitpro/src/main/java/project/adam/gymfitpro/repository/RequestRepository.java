package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.adam.gymfitpro.entity.RequestEntity;

public interface RequestRepository extends JpaRepository<RequestEntity, Integer> {

}
