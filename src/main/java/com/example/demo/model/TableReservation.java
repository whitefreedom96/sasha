package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class TableReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name="DATE")
    private Instant date;

    @Column(name="COUNT_PEOPLE")
    private int countPeople;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TABLE_ID")
    private Table table;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name="PAYMENT_STATUS")
    private PaymentStatus paymentStatus;




}
