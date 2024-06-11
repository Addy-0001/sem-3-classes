package project.adam.gymfitpro.entity;


// import javax.persistence.*;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserEntity {

        @Id
        private Integer emailAddress;
    
        private String password;
        private String firstName;
        private String lastName;
        private Boolean isAdminUser;
        private Boolean isStaffUser;
        private String userType;
        private Time timeSlotStart;
        private Time timeSlotEnd;
    
        @OneToOne(mappedBy = "user")
        private TrainerEntity trainer;
    
        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<NotificationEntity> notifications;
    
        @OneToOne(mappedBy = "user")
        private LockerEntity locker;
    
        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<PaymentEntity> payments;
    
        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<AttendanceEntity> attendances;
    
        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<ComplaintEntity> complaints;
    
        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<SessionEntity> sessions;
    
        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
        private List<RequestEntity> requests;
    
        // Getters and Setters
    }

