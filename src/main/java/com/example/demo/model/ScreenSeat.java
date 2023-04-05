package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class ScreenSeat {

    //insert in db 21 seat for each screen
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "SEAT_POSITION")
    private int seatPosition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCREEN_ID")
    private Screen screen;



}
