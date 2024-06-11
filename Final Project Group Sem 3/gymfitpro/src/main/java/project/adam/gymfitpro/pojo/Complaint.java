package project.adam.gymfitpro.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Complaint {
    private String commentAbout;
    private String complaintUserName;
    private String complaintMessage;
    private Integer userEmail;
}