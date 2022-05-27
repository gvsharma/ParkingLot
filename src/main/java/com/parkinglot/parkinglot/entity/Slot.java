package com.parkinglot.parkinglot.entity;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString()
@Entity
public class Slot extends BaseEntity {
    String name;
}
