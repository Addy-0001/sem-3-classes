package project.adam.gymfitpro.service;
import java.util.List;

import project.adam.gymfitpro.entity.ComplaintEntity;

public interface ComplaintService {
    List<ComplaintEntity> getAllComplaints();
    ComplaintEntity getComplaintById(String id);
    ComplaintEntity createComplaint(ComplaintEntity complaint);
    ComplaintEntity updateComplaint(String id, ComplaintEntity complaint);
    void deleteComplaint(String id);
}