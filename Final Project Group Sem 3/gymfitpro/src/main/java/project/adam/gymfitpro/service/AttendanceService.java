package project.adam.gymfitpro.service;
import java.util.List;
import project.adam.gymfitpro.entity.AttendanceEntity;


public interface AttendanceService {
    List<AttendanceEntity> getAllAttendances();
    AttendanceEntity getAttendanceById(String id);
    AttendanceEntity createAttendance(AttendanceEntity attendance);
    AttendanceEntity updateAttendance(String id, AttendanceEntity attendance);
    void deleteAttendance(String id);
}