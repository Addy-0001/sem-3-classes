package project.adam.gymfitpro.entity;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class RequestId implements Serializable {
    private Integer userEmail;
    private String supplementAndEquipmentId;
}