package project.adam.gymfitpro.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AttendanceEntity {
        @EmbeddedId
        private AttendanceId id;
    
        @MapsId("userEmail")
        @ManyToOne
        @JoinColumn(name = "userEmail")
        private UserEntity user;
    
    }
