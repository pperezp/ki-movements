package com.example.kimovements.model.button;

import com.example.kimovements.model.HitType;
import com.example.kimovements.model.Intensity;

import lombok.Getter;
import lombok.Setter;

public abstract class Button {
    protected Intensity intensity;
    protected HitType hitType;

    public Button(Intensity intensity, HitType hitType) {
        this.intensity = intensity;
        this.hitType = hitType;
    }

    public boolean is(Intensity intensity, HitType hitType) {
        return this.intensity == intensity && this.hitType == hitType;
    }

    public abstract String getDescription();
}
