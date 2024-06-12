package project.adam.gymfitpro.service;
import java.util.List;

import project.adam.gymfitpro.entity.LockerEntity;

public interface LockerService {
    List<LockerEntity> getAllLockers();
    LockerEntity getLockerById(Integer id);
    LockerEntity createLocker(LockerEntity locker);
    LockerEntity updateLocker(Integer id, LockerEntity locker);
    void deleteLocker(Integer id);
}