package project.adam.gymfitpro.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WorkoutEntity {
    @EmbeddedId
    private WorkoutId id;

    private Integer numberOfSets;
    private String repsPerSet;

    @MapsId("userEmail")
    @ManyToOne
    @JoinColumn(name = "userEmail")
    private UserEntity user;

    @MapsId("sessionId")
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "sessionUserEmail", referencedColumnName = "userEmail"),
        @JoinColumn(name = "sessionRecordedDate", referencedColumnName = "recordedDate")
    })
    private SessionEntity session;
}
