package project.adam.gymfitpro.entity;

import jakarta.persistence.*;

@Entity
public class RequestEntity {
        @EmbeddedId
        private RequestId id;
    
        @MapsId("userEmail")
        @ManyToOne
        @JoinColumn(name = "userEmail")
        private UserEntity user;
    
        @MapsId("supplementAndEquipmentId")
        @ManyToOne
        @JoinColumn(name = "supplementAndEquipmentId")
        private SupplementAndEquipmentEntity supplementAndEquipment;   
}
