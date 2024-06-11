package project.adam.gymfitpro.pojo;

import lombok.Getter;
import lombok.Setter;
import java.sql.Time;

@Getter
@Setter
public class User {
    private Integer emailAddress;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean isAdminUser;
    private Boolean isStaffUser;
    private String userType;
    private Time timeSlotStart;
    private Time timeSlotEnd;
}
