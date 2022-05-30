package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
    }

    public void letterClick(View view) {
        Button b = (Button)view;
        String letter=b.getText().toString();
        Intent intent = new Intent(LessonActivity.this, LessonActivity2.class);
        intent.putExtra("letter",letter);
        startActivity(intent);
    }
}