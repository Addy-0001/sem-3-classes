package project.adam.gymfitpro.entity;

import java.util.Date;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class SessionId {
    private Integer userEmail;
    private Date recordedDate;
}
