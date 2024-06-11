package project.adam.gymfitpro.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class ComplaintId {
    private Integer userEmail;
    private String commentAbout;
}
