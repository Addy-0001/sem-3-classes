package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.ComplaintEntity;
import project.adam.gymfitpro.entity.ComplaintId;

public interface ComplaintRepository extends JpaRepository<ComplaintEntity, ComplaintId> {

}
