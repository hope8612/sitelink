package com.example.wp_pt3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //버튼 변수선언
        Button button_naver = findViewById(R.id.button_naver);
        Button button_daum = findViewById(R.id.button_daum);
        Button button_11st = findViewById(R.id.button_11st);
        Button button_cgv = findViewById(R.id.button_cgv);
        Button button_google = findViewById(R.id.button_google);
        //URL 동작
        //네이버
        button_naver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(intent);
            }
        });
        //다음
        button_daum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.daum.net"));
                startActivity(intent);
            }
        });
        //11번가
        button_11st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.11st.co.kr"));
                startActivity(intent);
            }
        });
        //cgv
        button_cgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cgv.co.kr"));
                startActivity(intent);
            }
        });
        //구글
        button_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });

    }


}
