package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonActivity2 extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);
        textView=findViewById(R.id.textView2);
        imageView=findViewById(R.id.imageView);
        Intent intent = getIntent();
        String letter=intent.getStringExtra("letter");
        textView.setText(letter);

    }
}