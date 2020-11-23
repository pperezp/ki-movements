package com.example.kimovements.model;

import com.example.kimovements.model.button.Button;
import com.example.kimovements.model.joystick.JoystickBuilder;

import java.util.ArrayList;
import java.util.List;

public class CharacterBuilder {
    public static List<Character> getCharacters(){
        List<Character> characters = new ArrayList<>();

        List<Button> punchButtons = JoystickBuilder.getButtons(HitType.PUNCH);
        Button mpButton = JoystickBuilder.getButton(Intensity.MEDIUM, HitType.PUNCH);

        Character sabrewulf = new Character(CharacterName.SABREWULF);

        for(Button punchButton : punchButtons){
            sabrewulf.addMove(
                new Move()
                    .setName("Flaming Bat")
                    .addDirection(Direction.BACKWARD, Direction.DOWN, Direction.BACKWARD)
                    .setButton(punchButton)
            );

            sabrewulf.addMove(
                new Move()
                    .setName("Sabre-Spin")
                    .addDirection(Direction.BACKWARD, Direction.FORWARD)
                    .setButton(punchButton)
            );

            sabrewulf.addMove(
                new Move()
                    .setName("Reverse Sabre-Spin")
                    .addDirection(Direction.FORWARD, Direction.BACKWARD)
                    .setButton(mpButton)
            );
        }

        characters.add(sabrewulf);

        return characters;
    }
}
