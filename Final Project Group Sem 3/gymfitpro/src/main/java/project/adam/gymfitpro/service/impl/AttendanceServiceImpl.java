package project.adam.gymfitpro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.adam.gymfitpro.entity.AttendanceEntity;
import project.adam.gymfitpro.repository.AttendanceRepository;
import project.adam.gymfitpro.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public List<AttendanceEntity> getAllAttendances() {
        return attendanceRepository.findAll();
    }

    @Override
    public AttendanceEntity getAttendanceById(Integer id) {
        Optional<AttendanceEntity> attendance = attendanceRepository.findById(id);
        return attendance.orElse(null);
    }

    @Override
    public AttendanceEntity createAttendance(AttendanceEntity attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public AttendanceEntity updateAttendance(Integer id, AttendanceEntity attendance) {
        if (attendanceRepository.existsById(id)) {
            attendance.setId(id);
            return attendanceRepository.save(attendance);
        }
        return null;
    }

    @Override
    public void deleteAttendance(Integer id) {
        attendanceRepository.deleteById(id);
    }
}