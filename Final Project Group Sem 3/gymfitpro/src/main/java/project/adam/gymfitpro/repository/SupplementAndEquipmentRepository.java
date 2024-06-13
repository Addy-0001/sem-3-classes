package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.adam.gymfitpro.entity.SupplementAndEquipmentEntity;

@Repository
public interface SupplementAndEquipmentRepository extends JpaRepository<SupplementAndEquipmentEntity, Integer> {

}
