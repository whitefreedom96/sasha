package com.example.demo.model;

public enum RoomBedType {
    SINGLET("Single"),
    DOUBLE("Double");

    public final String label;

    private RoomBedType(String label) {
        this.label = label;
    }
}
