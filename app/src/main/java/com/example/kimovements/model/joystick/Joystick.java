package com.example.kimovements.model.joystick;

import com.example.kimovements.model.button.Button;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public abstract class Joystick {
    private final List<Button> buttons;

    public Joystick() {
        this.buttons = new ArrayList<>();
    }

    public Joystick addButton(Button button){
        this.buttons.add(button);
        return this;
    }
}
