package project.adam.gymfitpro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.adam.gymfitpro.entity.SessionEntity;
import project.adam.gymfitpro.repository.SessionRepository;
import project.adam.gymfitpro.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public List<SessionEntity> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public SessionEntity getSessionById(Integer id) {
        Optional<SessionEntity> session = sessionRepository.findById(id);
        return session.orElse(null);
    }

    @Override
    public SessionEntity createSession(SessionEntity session) {
        return sessionRepository.save(session);
    }

    @Override
    public SessionEntity updateSession(Integer id, SessionEntity session) {
        if (sessionRepository.existsById(id)) {
            session.setId(id);
            return sessionRepository.save(session);
        }
        return null;
    }

    @Override
    public void deleteSession(Integer id) {
        sessionRepository.deleteById(id);
    }
}