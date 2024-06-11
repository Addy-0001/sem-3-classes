package project.adam.gymfitpro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEntity {

    @EmbeddedId
    private NotificationId id;

    private String title;
    private String content;

    @ManyToOne
    @MapsId("userEmail")
    @JoinColumn(name = "userEmail")
    private UserEntity user;

}
