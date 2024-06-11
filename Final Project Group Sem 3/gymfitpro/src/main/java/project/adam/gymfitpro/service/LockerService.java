package project.adam.gymfitpro.service;
import java.util.List;

import project.adam.gymfitpro.entity.LockerEntity;

public interface LockerService {
    List<LockerEntity> getAllLockers();
    LockerEntity getLockerById(String id);
    LockerEntity createLocker(LockerEntity locker);
    LockerEntity updateLocker(String id, LockerEntity locker);
    void deleteLocker(String id);
}