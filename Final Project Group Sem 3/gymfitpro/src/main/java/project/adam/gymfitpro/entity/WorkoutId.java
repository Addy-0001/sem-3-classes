package project.adam.gymfitpro.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class WorkoutId implements Serializable {
    private Integer userEmail;
    private String exerciseName;
    private Date sessionRecordedDate;
}