package com.wen.w_materialbutton;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private CustomMaterialButton materialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        materialButton = findViewById(R.id.materialButton);
        testButtonStrategy();
    }

    private void testButtonStrategy() {
        LoginButtonStrategy loginButtonStrategy = new LoginButtonStrategy(materialButton);
        RegisterButtonStrategy registerButtonStrategy = new RegisterButtonStrategy(materialButton);
        ButtonManager buttonManager = new ButtonManager(loginButtonStrategy);
        buttonManager.createButtonView();
        buttonManager.setButtonStrategy(registerButtonStrategy);
        buttonManager.createButtonView();

    }

    private void createButtonViewByButtonManager(ButtonManager buttonManager) {

    }

    private void test() {
        // 定义按下和正常状态下的颜色值
        int[] colors = new int[]{Color.RED, Color.DKGRAY};
        int[][] states = new int[][]{
                new int[]{android.R.attr.state_pressed},
                new int[]{}
        };

//        int[] textColors = new int[]{
//                ContextCompat.getColorStateList(this, R.color.teal_200).getDefaultColor(),
//                ContextCompat.getColorStateList(this, R.color.testColor).getDefaultColor()
//        };
        int[][] textStates = new int[][]{
                new int[]{android.R.attr.state_pressed},
                new int[]{}
        };

        ColorStateList colorStateList = new ColorStateList(states, colors);
        materialButton.setBackgroundTintList(colorStateList);
//        materialButton.setTextColor(new ColorStateList(textStates, textColors));

        setBackgroundTintWithColorStates(textStates, R.color.teal_200, R.color.testColor);
    }

    public void setBackgroundTintWithColorStates(int[][] states, @DrawableRes int firstColor, @DrawableRes int lastColor) {
        @SuppressLint("ResourceType") int[] textColors = new int[]{
                ContextCompat.getColorStateList(this, firstColor).getDefaultColor(),
                ContextCompat.getColorStateList(this, lastColor).getDefaultColor()
        };
        materialButton.setTextColor(new ColorStateList(states, textColors));
    }
}