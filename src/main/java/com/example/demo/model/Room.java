package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ROOM_TYPE")
    private RoomType roomType;
    @Column(name = "ROOM_VIEW")
    private RoomView roomView;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "PEOPLE")
    private int people;
    @ElementCollection
    @Column(name = "FACILITIES")
    private List<String> facilities = new ArrayList<>();


}
