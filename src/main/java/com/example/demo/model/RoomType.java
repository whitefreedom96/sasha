package com.example.demo.model;

public enum RoomType {
    STANDARD("Standard"),
    STUDIO("Double"),
    APARTMENT("Apartment");

    public final String label;

    private RoomType(String label) {
        this.label = label;
    }
}
