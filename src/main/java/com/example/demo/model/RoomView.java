package com.example.demo.model;

public enum RoomView {
    SEA("Sea"),
    GARDEN("Garden"),
    POOL("Pool");

    public final String label;

    private RoomView(String label) {
        this.label = label;
    }
}
