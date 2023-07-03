package com.wen.w_materialbutton;

import androidx.annotation.ColorRes;
import androidx.annotation.Px;

public abstract class ButtonStrategy {
    protected CustomMaterialButton customMaterialButton;

    public ButtonStrategy(CustomMaterialButton customMaterialButton) {
        this.customMaterialButton = customMaterialButton;
    }

    @ColorRes
    public abstract int firstTextStateColor();

    @ColorRes
    public abstract int lastTextStateColor();

    @ColorRes
    public abstract int firstBackgroundStateColor();

    @ColorRes
    public abstract int lastBackgroundStateColor();

    public abstract int state();

    @Px
    public abstract int cornerRadius();


    public abstract void createButtonView();



}
