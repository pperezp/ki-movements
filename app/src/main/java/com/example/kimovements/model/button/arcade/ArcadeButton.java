package com.example.kimovements.model.button.arcade;

import com.example.kimovements.model.HitType;
import com.example.kimovements.model.Intensity;
import com.example.kimovements.model.button.Button;

public class ArcadeButton extends Button {
    public ArcadeButton(Intensity intensity, HitType hitType) {
        super(intensity, hitType);
    }

    @Override
    public String getDescription() {
        return intensity.name() + " " + hitType.name();
    }
}
