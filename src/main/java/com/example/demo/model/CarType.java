package com.example.demo.model;

public enum CarType {
    SPORT(2),
    SEDAN(5),
    VAN(8);

    public final int seats;

    private CarType(int seats) {
        this.seats = seats;
    }

}