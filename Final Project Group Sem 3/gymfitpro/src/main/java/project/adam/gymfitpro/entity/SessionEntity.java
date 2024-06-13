package project.adam.gymfitpro.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.sql.Time; 

@Entity
@Getter
@Setter
@Table(name = "sessions")
public class SessionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userEmailAddress;
    private Date recordedDate;
    private Time sessionDuration;
}