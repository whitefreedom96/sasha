package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class RoomReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name="START_DATE")
    private LocalDate startDate;
    @Column(name="END_DATE")
    private LocalDate endDate;
    @Column(name="ADULTS")
    private int adults;
    @Column(name="KIDS")
    private int kids;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROOM_ID")
    private Room room;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name="PAYMENT_STATUS")
    private PaymentStatus paymentStatus;
    @Column(name = "ROOM_BED_TYPE")
    private RoomBedType roomBedType;

}
