package com.parkinglot.parkinglot.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@ToString(exclude = {"VehicleColor"})
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle extends BaseEntity{
    @Column("vehicle_number")
    String vehicleNumber;
    @ManyToOne
    VehicleColor vehicleColor;

}
