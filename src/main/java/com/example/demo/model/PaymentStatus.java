package com.example.demo.model;

public enum PaymentStatus {
    PAID("Paid"),
    UNPAID("Unpaid");

    public final String label;

    private PaymentStatus(String label) {
        this.label = label;
    }
}
