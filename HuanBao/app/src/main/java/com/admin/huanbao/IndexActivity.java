package com.admin.huanbao;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.activity_index);
        Log.d("Main------->","activity_index被启动了");
        ImageView imageView = (ImageView) findViewById(R.id.images);
        final PikaqiuView pikaqiu = new PikaqiuView(IndexActivity.this);
        Button mBtn;
//
        pikaqiu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                pikaqiu.BitmapX = event.getX() - 150;
                pikaqiu.BitmapY = event.getY() - 150;
                //调用重绘方法
                pikaqiu.invalidate();
                return true;
            }
        });
        frameLayout.addView(pikaqiu);
        mBtn = (Button) findViewById(R.id.button_yc);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("------->","点击了按钮，开始跳转");
                Intent intent = new Intent(IndexActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }


}

