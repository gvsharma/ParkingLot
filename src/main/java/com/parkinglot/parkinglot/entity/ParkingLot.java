package com.parkinglot.parkinglot.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Table
@Entity
@NoArgsConstructor
@ToString(exclude = {"sllots"}, callSuper = true)
@AllArgsConstructor
@Builder
public class ParkingLot extends BaseEntity {
    String type;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Slot> slots = new ArrayList<>();

    @JsonProperty
    public List<Slot> getParkingSlot() {
        return slots;
    }

}
