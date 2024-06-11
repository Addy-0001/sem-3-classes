package project.adam.gymfitpro.service;

import java.util.List;
import project.adam.gymfitpro.entity.UserEntity;

public interface UserService {
    List<UserEntity> getAllUsers();

    UserEntity getUserById(String id);

    UserEntity createUser(UserEntity user);

    UserEntity updateUser(String id, UserEntity user);

    void deleteUser(String id);
}
