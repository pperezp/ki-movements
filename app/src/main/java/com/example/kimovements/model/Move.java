package com.example.kimovements.model;

import com.example.kimovements.model.button.Button;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Move {
    private String name;
    private List<Direction> directions;
    private Button button;

    public Move(){
        this.directions = new ArrayList<>();
    }

    public Move addDirection(Direction... directions){
        this.directions.addAll(Arrays.asList(directions));
        return this;
    }

    public Move setButton(Button button){
        this.button = button;
        return this;
    }

    public String getName() {
        return name;
    }

    public Move setName(String name) {
        this.name = name;
        return this;
    }

    @NotNull
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append(name);
        string.append(": ");

        for(Direction direction : directions){
            string.append(direction.name());
            string.append(" ");
        }

        string.append(button.getDescription());

        return string.toString();
    }
}
