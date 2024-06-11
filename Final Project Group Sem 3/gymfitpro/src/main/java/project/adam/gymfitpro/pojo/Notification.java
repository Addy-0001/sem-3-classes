package project.adam.gymfitpro.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notification {
    private Integer userEmail;
    private Integer id;
    private String title;
    private String content;
}

