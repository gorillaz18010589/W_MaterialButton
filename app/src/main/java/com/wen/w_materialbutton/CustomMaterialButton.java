package com.wen.w_materialbutton;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.button.MaterialButton;
import androidx.core.content.ContextCompat;

public class CustomMaterialButton extends MaterialButton {

    private ColorStateList backgroundTintList;
    private ColorStateList textTintList;

    public CustomMaterialButton(@NonNull Context context) {
        super(context);
    }

    public CustomMaterialButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomMaterialButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setBackgroundColorState(int[][] states, @DrawableRes int firstColor, @DrawableRes int lastColor) {
        @SuppressLint("ResourceType") int[] colors = new int[]{
                ContextCompat.getColor(getContext(), firstColor),
                ContextCompat.getColor(getContext(), lastColor)
        };
        backgroundTintList = new ColorStateList(states, colors);
        setBackgroundTintList(backgroundTintList);
    }

    public void setTextColorState(int[][] states, @DrawableRes int firstColor, @DrawableRes int lastColor) {
        @SuppressLint("ResourceType") int[] colors = new int[]{
                ContextCompat.getColor(getContext(), firstColor),
                ContextCompat.getColor(getContext(), lastColor)
        };
        textTintList = new ColorStateList(states, colors);
        setTextColor(textTintList);
    }

    public ColorStateList getBackgroundColorState() {
        return backgroundTintList;
    }

    public ColorStateList getTextColorState() {
        return textTintList;
    }

    public int getBackgroundColorStateFirstColor() {
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(new int[]{android.R.attr.state_pressed}, -1);
        }
        return -1;
    }

    public int getBackgroundColorStateLastColor() {
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(new int[]{}, -1);
        }
        return -1;
    }

    public int getTextColorStateFirstColor() {
        if (textTintList != null) {
            return textTintList.getColorForState(new int[]{android.R.attr.state_pressed}, -1);
        }
        return -1;
    }

    public int getTextColorStateLastColor() {
        if (textTintList != null) {
            return textTintList.getColorForState(new int[]{}, -1);
        }
        return -1;
    }
}
