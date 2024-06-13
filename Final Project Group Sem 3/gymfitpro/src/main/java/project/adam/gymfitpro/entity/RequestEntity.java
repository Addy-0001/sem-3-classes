package project.adam.gymfitpro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class RequestEntity {
        // @Id
        // @GeneratedValue(strategy = GenerationType.IDENTITY)
        // private Integer id;

        // @MapsId("userEmail")
        // @ManyToOne
        // @JoinColumn(name = "userEmail")
        // private UserEntity user;

        // @MapsId("supplementAndEquipmentId")
        // @ManyToOne
        // @JoinColumn(name = "supplementAndEquipmentId")
        // private SupplementAndEquipmentEntity supplementAndEquipment;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @ManyToOne
        private UserEntity user;

        @ManyToOne
        private SupplementAndEquipmentEntity supplementAndEquipment;
}
