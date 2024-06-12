package project.adam.gymfitpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.adam.gymfitpro.entity.LockerEntity;
import project.adam.gymfitpro.service.LockerService;

@RestController
@RequestMapping("/lockers")
public class LockerController {

    @Autowired
    private LockerService lockerService;

    @GetMapping
    public List<LockerEntity> getAllLockers() {
        return lockerService.getAllLockers();
    }

    @GetMapping("/{id}")
    public LockerEntity getLockerById(@PathVariable Integer id) {
        return lockerService.getLockerById(id);
    }

    @PostMapping
    public LockerEntity createLocker(@RequestBody LockerEntity locker) {
        return lockerService.createLocker(locker);
    }

    @PutMapping("/{id}")
    public LockerEntity updateLocker(@PathVariable Integer id, @RequestBody LockerEntity locker) {
        return lockerService.updateLocker(id, locker);
    }

    @DeleteMapping("/{id}")
    public void deleteLocker(@PathVariable Integer id) {
        lockerService.deleteLocker(id);
    }
}