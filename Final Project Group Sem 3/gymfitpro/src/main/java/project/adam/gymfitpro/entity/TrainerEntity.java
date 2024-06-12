package project.adam.gymfitpro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
// import project.adam.gymfitpro.pojo.User;

@Entity
@Table(name = "trainers")
@Getter
@Setter
public class TrainerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userEmailAddress;
    private String certificationTitle;
    private Integer salary;
}
