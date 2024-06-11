package project.adam.gymfitpro.service;
import java.util.List;
import project.adam.gymfitpro.entity.SessionEntity;

public interface SessionService {
    List<SessionEntity> getAllSessions();
    SessionEntity getSessionById(String id);
    SessionEntity createSession(SessionEntity session);
    SessionEntity updateSession(String id, SessionEntity session);
    void deleteSession(String id);
}
