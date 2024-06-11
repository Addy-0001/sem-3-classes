package project.adam.gymfitpro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class PaymentEntity {
    @EmbeddedId
    private PaymentId id;

    private Date paymentUntil;

    @MapsId("userEmail")
    @ManyToOne
    @JoinColumn(name = "userEmail")
    private UserEntity user;
}
