package com.example.kimovements.model.joystick;

public class ArcadeJoystick extends Joystick {
    @Override
    public String getDescription() {
        return JoystickType.ARCADE.name();
    }
}
