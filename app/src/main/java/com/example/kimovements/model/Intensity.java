package com.example.kimovements.model;

public enum Intensity {
    QUICK("Q"), MEDIUM("M") , FIERCE("F");

    private final String shortDescription;

    Intensity(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
