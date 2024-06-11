package project.adam.gymfitpro.entity;

import java.sql.Time;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SessionEntity {
    @EmbeddedId
    private SessionId id;

    private Time sessionDuration;

    @MapsId("userEmail")
    @ManyToOne
    @JoinColumn(name = "userEmail")
    private UserEntity user;

    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL)
    private List<WorkoutEntity> workouts;
}
