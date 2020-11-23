package com.example.kimovements.model;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private CharacterName characterName;
    private List<Move> moves;
    private List<Move> noMercies;
    private Move comboBreaker;
    private Move humiliation;
    private Move ultraCombo;

    public Character(CharacterName characterName){
        this.characterName = characterName;
        this.moves = new ArrayList<>();
        this.noMercies = new ArrayList<>();
    }

    public Character addMove(Move move){
        this.moves.add(move);
        return this;
    }

    public Character addNoMercy(Move move){
        this.noMercies.add(move);
        return this;
    }

    public CharacterName getCharacterName() {
        return characterName;
    }

    public void setCharacterName(CharacterName characterName) {
        this.characterName = characterName;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<Move> getNoMercies() {
        return noMercies;
    }

    public void setNoMercies(List<Move> noMercies) {
        this.noMercies = noMercies;
    }

    public Move getComboBreaker() {
        return comboBreaker;
    }

    public void setComboBreaker(Move comboBreaker) {
        this.comboBreaker = comboBreaker;
    }

    public Move getHumiliation() {
        return humiliation;
    }

    public void setHumiliation(Move humiliation) {
        this.humiliation = humiliation;
    }

    public Move getUltraCombo() {
        return ultraCombo;
    }

    public void setUltraCombo(Move ultraCombo) {
        this.ultraCombo = ultraCombo;
    }
}
