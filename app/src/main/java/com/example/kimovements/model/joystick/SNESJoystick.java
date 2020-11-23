package com.example.kimovements.model.joystick;

public class SNESJoystick extends Joystick{
    @Override
    public String getDescription() {
        return JoystickType.SNES.name();
    }
}
