package project.adam.gymfitpro.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.adam.gymfitpro.entity.LockerEntity;
import project.adam.gymfitpro.repository.LockerRepository;
import project.adam.gymfitpro.service.LockerService;

@Service
public class LockerServiceImpl implements LockerService {

    @Autowired
    private LockerRepository lockerRepository;

    @Override
    public List<LockerEntity> getAllLockers() {
        return lockerRepository.findAll();
    }

    @Override
    public LockerEntity getLockerById(Integer id) {
        Optional<LockerEntity> locker = lockerRepository.findById(id);
        return locker.orElse(null);
    }

    @Override
    public LockerEntity createLocker(LockerEntity locker) {
        return lockerRepository.save(locker);
    }

    @Override
    public LockerEntity updateLocker(Integer id, LockerEntity locker) {
        if (lockerRepository.existsById(id)) {
            locker.setId(id);
            return lockerRepository.save(locker);
        }
        return null;
    }

    @Override
    public void deleteLocker(Integer id) {
        lockerRepository.deleteById(id);
    }
}