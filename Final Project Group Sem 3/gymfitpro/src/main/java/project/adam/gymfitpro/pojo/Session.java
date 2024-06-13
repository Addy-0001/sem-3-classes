package project.adam.gymfitpro.pojo;


import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import java.sql.Time; 

@Getter
@Setter
public class Session {
    private Integer userEmail;
    private Date recordedDate;
    private Time sessionDuration;
}
