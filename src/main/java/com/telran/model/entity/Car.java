package com.telran.model.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
@ToString

@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "BRAND")
    private String brand;


    @Column(name = "MODEL")
    private String model;
}
