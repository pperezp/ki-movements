package com.example.kimovements.model.button.snes;

import com.example.kimovements.model.HitType;
import com.example.kimovements.model.Intensity;
import com.example.kimovements.model.button.Button;

public class SNESButton extends Button {
    private SNESButtonLetter snesButtonLetter;

    public SNESButton(SNESButtonLetter snesButtonLetter, Intensity intensity, HitType hitType) {
        super(intensity, hitType);
        this.snesButtonLetter = snesButtonLetter;
    }

    @Override
    public String getDescription() {
        return snesButtonLetter.name();
    }

    public SNESButtonLetter getSnesButtonLetter() {
        return snesButtonLetter;
    }

    public void setSnesButtonLetter(SNESButtonLetter snesButtonLetter) {
        this.snesButtonLetter = snesButtonLetter;
    }
}
