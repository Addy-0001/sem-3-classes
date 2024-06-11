package project.adam.gymfitpro.entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
// import project.adam.gymfitpro.pojo.User;

@Getter
@Setter
public class TrainerEntity {
    @Id
    private Integer userEmail;

    private String certificationTitle;
    private Integer salary;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userEmail")
    private UserEntity user;

}
