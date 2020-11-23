package com.example.kimovements.model;

public enum HitType {
    PUNCH("P"), KICK("K");

    private final String shortDescription;

    HitType(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
