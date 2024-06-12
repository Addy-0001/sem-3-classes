package project.adam.gymfitpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import project.adam.gymfitpro.entity.SessionEntity;
import project.adam.gymfitpro.service.SessionService;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping
    public List<SessionEntity> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public SessionEntity getSessionById(@PathVariable Integer id) {
        return sessionService.getSessionById(id);
    }

    @PostMapping
    public SessionEntity createSession(@RequestBody SessionEntity session) {
        return sessionService.createSession(session);
    }

    @PutMapping("/{id}")
    public SessionEntity updateSession(@PathVariable Integer id, @RequestBody SessionEntity session) {
        return sessionService.updateSession(id, session);
    }

    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable Integer id) {
        sessionService.deleteSession(id);
    }
}