package com.parkinglot.parkinglot.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = {"slot", "vehicle"}, callSuper = true)
public class Ticket extends BaseEntity {
    @OneToMany(cascade = CascadeType.ALL)
    Vehicle vehicle;

    @OneToOne
    Slot slot;

    @JsonProperty
    public String getREgistrationNumber() {
        return vehicle.getVehicleNumber();
    }

}
