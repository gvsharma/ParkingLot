package com.parkinglot.parkinglot.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class VehicleColor extends BaseEntity{
    String color;
}
