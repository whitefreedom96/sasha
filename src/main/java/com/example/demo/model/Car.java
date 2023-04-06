package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CAR_TYPE")
    private CarType carType;

    @Column(name = "CAR_NAME")
    private String carName;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<FileResource> fileResources = new ArrayList<>();
}
