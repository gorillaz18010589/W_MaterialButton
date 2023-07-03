package com.wen.w_materialbutton;

public class LoginButtonStrategy extends ButtonStrategy {
    public LoginButtonStrategy(CustomMaterialButton customMaterialButton) {
        super(customMaterialButton);
    }

    @Override
    public int firstTextStateColor() {
        return R.color.design_default_color_background;
    }

    @Override
    public int lastTextStateColor() {
        return R.color.design_default_color_error;
    }

    @Override
    public int firstBackgroundStateColor() {
        return R.color.testColor;
    }

    @Override
    public int lastBackgroundStateColor() {
        return R.color.design_default_color_primary_dark;
    }

    @Override
    public int state() {
        return android.R.attr.state_pressed;
    }

    @Override
    public int cornerRadius() {
        return 50;
    }

    @Override
    public void createButtonView() {
        int[][] states = new int[][]{
                new int[]{this.state()},
                new int[]{}};

        customMaterialButton.setTextColorState(states,
                this.firstTextStateColor(),
                this.lastTextStateColor());
        customMaterialButton.setBackgroundColorState(states,
                this.firstBackgroundStateColor(),
                this.lastBackgroundStateColor());
//        customMaterialButton.setTypeface(Typeface.createFromAsset(getAssets(),"s"));
        customMaterialButton.setCornerRadius(this.cornerRadius());
    }


}
