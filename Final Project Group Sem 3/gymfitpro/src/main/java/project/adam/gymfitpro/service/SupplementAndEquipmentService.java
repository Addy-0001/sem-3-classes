package project.adam.gymfitpro.service;

import java.util.List;

import project.adam.gymfitpro.entity.SupplementAndEquipmentEntity;

public interface SupplementAndEquipmentService {
    List<SupplementAndEquipmentEntity> getAllSupplementAndEquipment();
    SupplementAndEquipmentEntity getSupplementAndEquipmentById(String id);
    SupplementAndEquipmentEntity createSupplementAndEquipment(SupplementAndEquipmentEntity supplementAndEquipment);
    SupplementAndEquipmentEntity updateSupplementAndEquipment(String id, SupplementAndEquipmentEntity supplementAndEquipment);
    void deleteSupplementAndEquipment(String id);
}