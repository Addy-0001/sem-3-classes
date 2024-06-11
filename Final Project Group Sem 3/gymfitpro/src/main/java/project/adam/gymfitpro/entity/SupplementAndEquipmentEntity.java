package project.adam.gymfitpro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class SupplementAndEquipmentEntity {

    @Id
    private String id;

    private String type;
    private String name;
    private Integer cost;

    @OneToMany(mappedBy = "supplementAndEquipment", cascade = CascadeType.ALL)
    private List<RequestEntity> requests;
}
