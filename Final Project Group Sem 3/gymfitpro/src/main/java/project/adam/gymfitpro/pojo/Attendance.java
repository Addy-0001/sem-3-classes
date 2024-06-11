package project.adam.gymfitpro.pojo;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Attendance {
    private Date dateRecorded;
    private Integer userEmail;
}
