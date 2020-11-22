package com.example.kimovements.model;

import com.example.kimovements.model.button.Button;

import java.util.List;

public abstract class Joystick {
    protected List<Button> buttons;

    public Button getButton(Intensity intensity, HitType hitType){
        for(Button button : this.buttons){
            if(button.is(intensity, hitType)){
                return button;
            }
        }

        return null;
    }
}
