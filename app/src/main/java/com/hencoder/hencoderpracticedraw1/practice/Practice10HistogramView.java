package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice10HistogramView extends View {
    Paint paint = new Paint();
    Path path = new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setColor(Color.GREEN);
        canvas.drawRect(170,593,260,598, paint);
        canvas.drawRect(280,580,370,598, paint);
        canvas.drawRect(390,580,480,598, paint);
        canvas.drawRect(500,390,590,598, paint);
        canvas.drawRect(610,300,700,598, paint);
        canvas.drawRect(720,200,810,598, paint);
        canvas.drawRect(830,400,920,598, paint);

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLine(150,150,150,600,paint);
        canvas.drawLine(150,600,950,600,paint);

        paint.setTextSize(22);
        canvas.drawText("Froyo", 190, 620, paint);
        canvas.drawText("GB", 320, 620, paint);
        canvas.drawText("ICS", 425, 620, paint);
        canvas.drawText("JB", 535, 620, paint);
        canvas.drawText("KitKat", 630, 620, paint);
        canvas.drawText("W", 765, 620, paint);
        canvas.drawText("J", 865, 620, paint);

        paint.setTextSize(40);
        canvas.drawText("直方图",470,720,paint);
    }
}
