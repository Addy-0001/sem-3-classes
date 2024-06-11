package project.adam.gymfitpro.entity;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


@Embeddable
@Getter
@Setter
public class AttendanceId implements Serializable {
    private Integer userEmail;
    private Date dateRecorded;
}
