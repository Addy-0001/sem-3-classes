package project.adam.gymfitpro.pojo;

import java.sql.Time;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Session {
    private Integer userEmail;
    private Date recordedDate;
    private Time sessionDuration;
}
