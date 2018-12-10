package com.cafe.max.exam_final;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private ShapeDrawable mDrawable;
    private int x = 270;
    private int y = 88;
    private int width = 515;
    private int height = 250;

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(Color.RED);
        mDrawable.setBounds(x, y, x + width, y + height);
    }

    protected void setColor(int color){
        mDrawable.getPaint().setColor(color);
    }

    protected void onDraw(Canvas canvas) {
        mDrawable.draw(canvas);
    }
}