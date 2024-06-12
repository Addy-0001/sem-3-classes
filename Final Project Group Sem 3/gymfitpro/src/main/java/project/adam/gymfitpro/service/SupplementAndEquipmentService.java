package project.adam.gymfitpro.service;

import java.util.List;

import project.adam.gymfitpro.entity.SupplementAndEquipmentEntity;

public interface SupplementAndEquipmentService {
    List<SupplementAndEquipmentEntity> getAllSupplementAndEquipment();
    SupplementAndEquipmentEntity getSupplementAndEquipmentById(Integer id);
    SupplementAndEquipmentEntity createSupplementAndEquipment(SupplementAndEquipmentEntity supplementAndEquipment);
    SupplementAndEquipmentEntity updateSupplementAndEquipment(Integer id, SupplementAndEquipmentEntity supplementAndEquipment);
    void deleteSupplementAndEquipment(Integer id);
}