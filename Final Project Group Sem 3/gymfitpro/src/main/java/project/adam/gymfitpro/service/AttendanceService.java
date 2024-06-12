package project.adam.gymfitpro.service;
import java.util.List;
import project.adam.gymfitpro.entity.AttendanceEntity;



public interface AttendanceService {
    List<AttendanceEntity> getAllAttendances();
    AttendanceEntity getAttendanceById(Integer id);
    AttendanceEntity createAttendance(AttendanceEntity attendance);
    AttendanceEntity updateAttendance(Integer id, AttendanceEntity attendance);
    void deleteAttendance(Integer id);
}