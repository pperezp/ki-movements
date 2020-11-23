package com.example.kimovements.model;

public enum CharacterName {
    ORCHID("B. Orchid"), THUNDER("Chief Thunder"),
    CINDER("Cinder"), FULGORE("Fulgore"), GLACIUS("Glacius"),
    JAGO("Jago"), RIPTOR("Riptor"), SABREWULF("Sabrewulf"),
    SPINAL("Spinal"), COMBO("TJ Combo"), EYEDOL("Eyedol");

    private final String name;

    CharacterName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
