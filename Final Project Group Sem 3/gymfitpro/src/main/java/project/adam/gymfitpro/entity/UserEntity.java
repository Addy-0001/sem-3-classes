package project.adam.gymfitpro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String emailAddress;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean isAdminUser;
    private Boolean isStaffUser;
    private String userType;
    private String timeSlotStart;
    private String timeSlotEnd;
}


