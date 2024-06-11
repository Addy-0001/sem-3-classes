package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.adam.gymfitpro.entity.RequestEntity;
import project.adam.gymfitpro.entity.RequestId;

public interface RequestRepository extends JpaRepository<RequestEntity, RequestId> {

}
