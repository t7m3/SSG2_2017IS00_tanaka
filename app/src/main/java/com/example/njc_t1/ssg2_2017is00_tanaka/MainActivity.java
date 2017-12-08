package com.example.njc_t1.ssg2_2017is00_tanaka;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //グローバル変数（インスタンス変数）
    ImageViewEnemy imageViewEnemy;

    //画面の幅、高さを取得する
    DisplayMetrics dm = Resources.getSystem().getDisplayMetrics();
    int screenWidth = dm.widthPixels;
    int screenHeight = dm.heightPixels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView R_imageViewEnemy = (ImageView)findViewById(R.id.imageViewEnemy);
        //敵のインスタンスの生成
        int x = 0;
        int y = screenHeight *5/100;
        imageViewEnemy = new ImageViewEnemy(R_imageViewEnemy, x, y);
    }
}
