package com.example.kimovements.model.joystick;

import com.example.kimovements.model.button.Button;

import java.util.ArrayList;
import java.util.List;

public abstract class Joystick {
    private final List<Button> buttons;

    public Joystick() {
        this.buttons = new ArrayList<>();
    }

    public Joystick addButton(Button button){
        this.buttons.add(button);
        return this;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public abstract String getDescription();
}
