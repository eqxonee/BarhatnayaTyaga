package com.example.barhatnayatyaga.model;

import lombok.*;
import jakarta.persistence.*;


@Entity
@Table(name =  "booking")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}