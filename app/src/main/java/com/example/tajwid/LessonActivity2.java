package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        if(letter.equals("ض")){
            imageView.setImageResource(R.drawable.hafia);
        }
        else if(letter.equals("ء")||letter.equals("ه")||letter.equals("ع")||letter.equals("ح")||letter.equals("غ")||letter.equals("خ")){
            imageView.setImageResource(R.drawable.halaqia);
        }
        else if(letter.equals("ق")||letter.equals("ك")){
            imageView.setImageResource(R.drawable.lahatia);
        }
        else if(letter.equals("ط")||letter.equals("ذ")||letter.equals("ث")){
            imageView.setImageResource(R.drawable.laswia);
        }
        else if(letter.equals("ا")||letter.equals("و")||letter.equals("ي")){
            imageView.setImageResource(R.drawable.madda);
        }
        else if(letter.equals("ت")||letter.equals("د")||letter.equals("ط")){
            imageView.setImageResource(R.drawable.natia);
        }
        else if(letter.equals("س")||letter.equals("ص")||letter.equals("ز")){
            imageView.setImageResource(R.drawable.sagaria);
        }
        else if(letter.equals("ب")||letter.equals("م")){
            imageView.setImageResource(R.drawable.shafoia);
        }
        else if(letter.equals("ف")){
            imageView.setImageResource(R.drawable.shafoia2);
        }
        else if(letter.equals("ج")||letter.equals("ش")){
            imageView.setImageResource(R.drawable.shajria);
        }
        else if(letter.equals("ل")||letter.equals("ن")||letter.equals("ر")){
            imageView.setImageResource(R.drawable.zalqia);
        }
    }
}