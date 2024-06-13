package project.adam.gymfitpro.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.adam.gymfitpro.entity.SupplementAndEquipmentEntity;
import project.adam.gymfitpro.repository.SupplementAndEquipmentRepository;
import project.adam.gymfitpro.service.SupplementAndEquipmentService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SupplementAndEquipmentServiceImpl implements SupplementAndEquipmentService {

    private final SupplementAndEquipmentRepository supplementAndEquipmentRepository;

    @Override
    public List<SupplementAndEquipmentEntity> getAllSupplementAndEquipment() {
        return supplementAndEquipmentRepository.findAll();
    }

    @Override
    public SupplementAndEquipmentEntity getSupplementAndEquipmentById(Integer id) {
        Optional<SupplementAndEquipmentEntity> supplementAndEquipment = supplementAndEquipmentRepository.findById(id);
        return supplementAndEquipment.orElse(null);
    }

    @Override
    public SupplementAndEquipmentEntity createSupplementAndEquipment(SupplementAndEquipmentEntity supplementAndEquipment) {
        return supplementAndEquipmentRepository.save(supplementAndEquipment);
    }

    @Override
    public SupplementAndEquipmentEntity updateSupplementAndEquipment(Integer id, SupplementAndEquipmentEntity supplementAndEquipment) {
        if (supplementAndEquipmentRepository.existsById(id)) {
            supplementAndEquipment.setId(id);
            return supplementAndEquipmentRepository.save(supplementAndEquipment);
        }
        return null;
    }

    @Override
    public void deleteSupplementAndEquipment(Integer id) {
        supplementAndEquipmentRepository.deleteById(id);
    }
}