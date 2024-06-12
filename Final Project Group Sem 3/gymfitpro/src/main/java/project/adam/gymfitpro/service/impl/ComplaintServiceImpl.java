package project.adam.gymfitpro.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.adam.gymfitpro.entity.ComplaintEntity;
import project.adam.gymfitpro.repository.ComplaintRepository;
import project.adam.gymfitpro.service.ComplaintService;

@Service
public class ComplaintServiceImpl implements ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    @Override
    public List<ComplaintEntity> getAllComplaints() {
        return complaintRepository.findAll();
    }

    @Override
    public ComplaintEntity getComplaintById(Integer id) {
        Optional<ComplaintEntity> complaint = complaintRepository.findById(id);
        return complaint.orElse(null);
    }

    @Override
    public ComplaintEntity createComplaint(ComplaintEntity complaint) {
        return complaintRepository.save(complaint);
    }

    @Override
    public ComplaintEntity updateComplaint(Integer id, ComplaintEntity complaint) {
        if (complaintRepository.existsById(id)) {
            complaint.setId(id);
            return complaintRepository.save(complaint);
        }
        return null;
    }

    @Override
    public void deleteComplaint(Integer id) {
        complaintRepository.deleteById(id);
    }
}