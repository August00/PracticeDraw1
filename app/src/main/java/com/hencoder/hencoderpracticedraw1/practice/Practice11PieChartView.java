package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Practice11PieChartView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setARGB(255,255,215,0);
        canvas.drawArc(250,100,650,500,-50,48,true,paint);
        paint.setARGB(255,138,43,226);
        canvas.drawArc(250,100,650,500,1,6,true,paint);
        paint.setARGB(255,139,139,122);
        canvas.drawArc(250,100,650,500,9,6,true,paint);
        paint.setARGB(255,107,142,35);
        canvas.drawArc(250,100,650,500,18,58,true,paint);
        paint.setARGB(255,30,144,255);
        canvas.drawArc(250,100,650,500,79,97,true,paint);
        paint.setARGB(255,225,69,0);
        canvas.drawArc(240,90,640,490,-180,127,true,paint);
    }
}
