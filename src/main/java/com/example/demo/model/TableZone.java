package com.example.demo.model;

public enum TableZone {
    BAR("Bar"),
    SALON("Salon"),
    TERRACE("Terrace");

    public final String label;

    private TableZone(String label) {
        this.label = label;
    }
}
