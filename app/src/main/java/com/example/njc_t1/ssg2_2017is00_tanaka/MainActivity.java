package com.example.njc_t1.ssg2_2017is00_tanaka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static android.R.attr.x;
import static android.R.attr.y;

public class MainActivity extends AppCompatActivity {

    //グローバル変数（インスタンス変数）
    ImageViewEnemy imageViewEnemy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView R_imageViewEnemy = (ImageView)findViewById(R.id.imageViewEnemy);
        //敵のインスタンスの生成
        int x = 0;
        int y = 100;
        imageViewEnemy = new ImageViewEnemy(R_imageViewEnemy, x, y);
    }
}
