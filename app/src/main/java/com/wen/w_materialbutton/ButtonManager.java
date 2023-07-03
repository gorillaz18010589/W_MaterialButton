package com.wen.w_materialbutton;

import android.graphics.Typeface;

public class ButtonManager {
    protected ButtonStrategy buttonStrategy;

    public ButtonManager(ButtonStrategy buttonStrategy) {
        this.buttonStrategy = buttonStrategy;
    }

    public void setButtonStrategy(ButtonStrategy buttonStrategy) {
        this.buttonStrategy = buttonStrategy;
    }


    public void createButtonView(){
        this.buttonStrategy.createButtonView();
    }
}
