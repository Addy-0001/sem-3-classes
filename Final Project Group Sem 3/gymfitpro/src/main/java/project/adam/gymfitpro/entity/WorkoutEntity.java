package project.adam.gymfitpro.entity;

import jakarta.persistence.*; 
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "workouts")
public class WorkoutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userEmailAddress;
    private String exerciseName;
    private Integer numberOfSets;
    private String repsPerSet;
}
