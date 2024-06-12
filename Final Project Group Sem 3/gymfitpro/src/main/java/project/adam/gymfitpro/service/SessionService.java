package project.adam.gymfitpro.service;
import java.util.List;
import project.adam.gymfitpro.entity.SessionEntity;

public interface SessionService {
    List<SessionEntity> getAllSessions();
    SessionEntity getSessionById(Integer id);
    SessionEntity createSession(SessionEntity session);
    SessionEntity updateSession(Integer id, SessionEntity session);
    void deleteSession(Integer id);
}