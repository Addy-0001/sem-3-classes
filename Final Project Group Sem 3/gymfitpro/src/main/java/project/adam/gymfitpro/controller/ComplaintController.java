package project.adam.gymfitpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import project.adam.gymfitpro.entity.ComplaintEntity;
import project.adam.gymfitpro.service.ComplaintService;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @GetMapping
    public List<ComplaintEntity> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    @GetMapping("/{id}")
    public ComplaintEntity getComplaintById(@PathVariable Integer id) {
        return complaintService.getComplaintById(id);
    }

    @PostMapping
    public ComplaintEntity createComplaint(@RequestBody ComplaintEntity complaint) {
        return complaintService.createComplaint(complaint);
    }

    @PutMapping("/{id}")
    public ComplaintEntity updateComplaint(@PathVariable Integer id, @RequestBody ComplaintEntity complaint) {
        return complaintService.updateComplaint(id, complaint);
    }

    @DeleteMapping("/{id}")
    public void deleteComplaint(@PathVariable Integer id) {
        complaintService.deleteComplaint(id);
    }
}