package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.adam.gymfitpro.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    
}
