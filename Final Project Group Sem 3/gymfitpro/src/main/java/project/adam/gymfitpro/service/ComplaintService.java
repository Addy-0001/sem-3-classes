package project.adam.gymfitpro.service;
import java.util.List;

import project.adam.gymfitpro.entity.ComplaintEntity;


public interface ComplaintService {
    List<ComplaintEntity> getAllComplaints();
    ComplaintEntity getComplaintById(Integer id);
    ComplaintEntity createComplaint(ComplaintEntity complaint);
    ComplaintEntity updateComplaint(Integer id, ComplaintEntity complaint);
    void deleteComplaint(Integer id);
}