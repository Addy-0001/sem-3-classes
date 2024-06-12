package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.adam.gymfitpro.entity.SessionEntity;

public interface SessionRepository extends JpaRepository<SessionEntity, Integer> {

}
