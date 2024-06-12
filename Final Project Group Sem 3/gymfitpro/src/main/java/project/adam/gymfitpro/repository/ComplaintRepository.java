package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.ComplaintEntity;

public interface ComplaintRepository extends JpaRepository<ComplaintEntity, Integer> {

}
