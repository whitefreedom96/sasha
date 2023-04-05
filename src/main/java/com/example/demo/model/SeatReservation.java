package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class SeatReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name="DATE")
    private Instant date;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "seat_reservation_map",
            joinColumns = { @JoinColumn(name = "seat_reservation_id") },
            inverseJoinColumns = { @JoinColumn(name = "seat_id") }
    )
    private List<ScreenSeat> seats;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    
    @Column(name="PAYMENT_STATUS")
    private PaymentStatus paymentStatus;


}
