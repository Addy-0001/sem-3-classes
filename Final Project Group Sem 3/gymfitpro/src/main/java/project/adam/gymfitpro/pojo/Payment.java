package project.adam.gymfitpro.pojo;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Payment {
    private Integer userEmail;
    private Date paymentDate;
    private Date paymentUntil;

}
