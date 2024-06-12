package project.adam.gymfitpro.service;

import java.util.List;
import project.adam.gymfitpro.entity.UserEntity;

public interface UserService {
    List<UserEntity> getAllUsers();
    UserEntity getUserById(Integer id);
    UserEntity createUser(UserEntity user);
    UserEntity updateUser(Integer id, UserEntity user);
    void deleteUser(Integer id);
}