package com.admin.huanbao;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class PikaqiuView extends View {
    public float BitmapX;
    public float BitmapY;

    public PikaqiuView(Context context) {
        super(context);
        BitmapX=0;
        BitmapY=200;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//创建,并且实例化Paint的对象
        Paint paint = new Paint();
        //根据图片生成位图对象
        Bitmap bitmap = BitmapFactory.decodeResource(PikaqiuView.this.getResources(),R.drawable.lovely1);
        //绘制萌妹子
        canvas.drawBitmap(bitmap,BitmapX,BitmapY,paint);
        //判断图片是否回收,木有回收的话强制收回图片
        if(bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }
}
