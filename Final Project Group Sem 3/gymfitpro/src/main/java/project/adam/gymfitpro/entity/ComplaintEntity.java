package project.adam.gymfitpro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ComplaintEntity {
    @EmbeddedId
    private ComplaintId id;

    private String commentAbout;
    private String complaintUserName;
    private String complaintMessage;

    @MapsId("userEmail")
    @ManyToOne
    @JoinColumn(name = "userEmail")
    private UserEntity user;

}
