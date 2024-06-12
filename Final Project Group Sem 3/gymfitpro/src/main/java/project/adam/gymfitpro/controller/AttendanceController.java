package project.adam.gymfitpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import project.adam.gymfitpro.entity.AttendanceEntity;
import project.adam.gymfitpro.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping
    public List<AttendanceEntity> getAllAttendances() {
        return attendanceService.getAllAttendances();
    }

    @GetMapping("/{id}")
    public AttendanceEntity getAttendanceById(@PathVariable Integer id) {
        return attendanceService.getAttendanceById(id);
    }

    @PostMapping
    public AttendanceEntity createAttendance(@RequestBody AttendanceEntity attendance) {
        return attendanceService.createAttendance(attendance);
    }

    @PutMapping("/{id}")
    public AttendanceEntity updateAttendance(@PathVariable Integer id, @RequestBody AttendanceEntity attendance) {
        return attendanceService.updateAttendance(id, attendance);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendance(@PathVariable Integer id) {
        attendanceService.deleteAttendance(id);
    }
}