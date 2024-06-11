package project.adam.gymfitpro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LockerEntity {
    @Id
    private String lockerId;
    @OneToOne
    @JoinColumn(name = "userEmail")
    private UserEntity user;
}
