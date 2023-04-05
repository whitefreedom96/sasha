package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name="tables")
@NoArgsConstructor
@Getter
@Setter
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TABLE_ZONE")
    private TableZone tableZone;
    @Column(name = "IS_SMOKING")
    private boolean smoking;
    @Column(name = "SEATS")
    private int seats;
    @Column(name = "TABLE_NUMBER")
    private int tableNumber;

}
