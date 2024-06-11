package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.adam.gymfitpro.entity.SessionEntity;
import project.adam.gymfitpro.entity.SessionId;

public interface SessionRepository extends JpaRepository<SessionEntity, SessionId> {

}
