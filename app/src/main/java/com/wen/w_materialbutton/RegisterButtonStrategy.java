package com.wen.w_materialbutton;

public class RegisterButtonStrategy extends ButtonStrategy{

    public RegisterButtonStrategy(CustomMaterialButton customMaterialButton) {
        super(customMaterialButton);
    }

    @Override
    public int firstTextStateColor() {
        return R.color.black;
    }

    @Override
    public int lastTextStateColor() {
        return R.color.white;
    }

    @Override
    public int firstBackgroundStateColor() {
        return R.color.testColor2;
    }

    @Override
    public int lastBackgroundStateColor() {
        return R.color.testColor;
    }

    @Override
    public int state() {
        return android.R.attr.state_pressed;
    }

    @Override
    public int cornerRadius() {
        return 20;
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
        customMaterialButton.setText("測試這是註冊模式的策略變異");
    }
}
