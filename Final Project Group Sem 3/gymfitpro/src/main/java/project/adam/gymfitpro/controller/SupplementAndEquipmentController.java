package project.adam.gymfitpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import project.adam.gymfitpro.entity.SupplementAndEquipmentEntity;
import project.adam.gymfitpro.service.SupplementAndEquipmentService;

@RestController
@RequestMapping("/supplements-equipment")
public class SupplementAndEquipmentController {

    @Autowired
    private SupplementAndEquipmentService supplementAndEquipmentService;

    @GetMapping
    public List<SupplementAndEquipmentEntity> getAllSupplementAndEquipment() {
        return supplementAndEquipmentService.getAllSupplementAndEquipment();
    }

    @GetMapping("/{id}")
    public SupplementAndEquipmentEntity getSupplementAndEquipmentById(@PathVariable Integer id) {
        return supplementAndEquipmentService.getSupplementAndEquipmentById(id);
    }

    @PostMapping
    public SupplementAndEquipmentEntity createSupplementAndEquipment(
            @RequestBody SupplementAndEquipmentEntity supplementAndEquipment) {
        return supplementAndEquipmentService.createSupplementAndEquipment(supplementAndEquipment);
    }

    @PutMapping("/{id}")
    public SupplementAndEquipmentEntity updateSupplementAndEquipment(@PathVariable Integer id,
            @RequestBody SupplementAndEquipmentEntity supplementAndEquipment) {
        return supplementAndEquipmentService.updateSupplementAndEquipment(id, supplementAndEquipment);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplementAndEquipment(@PathVariable Integer id) {
        supplementAndEquipmentService.deleteSupplementAndEquipment(id);
    }
}