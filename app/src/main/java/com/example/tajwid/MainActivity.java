package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button repoButton,lessonButton,testButton,customizedLessonButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repoButton=findViewById(R.id.button);
        repoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String repoAddress = "https://github.com/Bsef19m519/tajwid";
                openWebPage(repoAddress);
            }
        });
        lessonButton = findViewById(R.id.button2);
        lessonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LessonActivity.class);
                startActivity(intent);
            }
        });
        testButton = findViewById(R.id.button3);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                startActivity(intent);
            }
        });
        customizedLessonButton = findViewById(R.id.button8);
        customizedLessonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListViewLessonActivity.class);
                startActivity(intent);
            }
        });
    }
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}