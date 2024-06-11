package project.adam.gymfitpro.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class NotificationId implements Serializable {
    private Integer userEmail;
    private Integer id;
}
