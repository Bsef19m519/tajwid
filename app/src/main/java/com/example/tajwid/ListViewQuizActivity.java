package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewQuizActivity extends AppCompatActivity {
    Button button,button2;
    private int score;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        score=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_quiz);
        button=findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListViewQuizActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        button2=findViewById(R.id.button11);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListViewQuizActivity.this,ResultActivity.class);
                intent.putExtra("score",score);
                startActivity(intent);
            }
        });
        listView=findViewById(R.id.listQuiz);
        //arraylist creation
        ArrayList<MultipleChoiceQuestion> arrayList = new ArrayList<MultipleChoiceQuestion>();
        arrayList.add(new MultipleChoiceQuestion(
            "Q1","حروف حلقی کی نشاندہی کریں۔",
            "ح","ق","ک","ب",1
        ));
        arrayList.add(new MultipleChoiceQuestion(
                "Q2","مخرج؛ زبان کی نوک جب اوپر اور نیچے کے اگلے دونوں دانتوں کے درمیان آ جاےٴ۔"
                ,"و","ی","ل","ص",4
        ));
        arrayList.add(new MultipleChoiceQuestion(
                "Q3","مندرجہ ذیل میں سے کونسا حرف حروف ذلقیہ نہیں ہے۔"
                ,"ل","ف","ن","ر",2
        ));
        arrayList.add(new MultipleChoiceQuestion(
                "Q4","ۛۛۛمخرج؛ دونوں ہونٹوں کی بیرونی تری ملنے سے۔"
                ,"ن","م","ب","و",2
        ));
        arrayList.add(new MultipleChoiceQuestion(
                "Q5","حروف نطعیہ کی نشاندہی کریں۔"
                ,"ب","ق","د","ز",3
        ));

        MyQuizAdapter adapter = new MyQuizAdapter(this,arrayList);
        listView.setAdapter(adapter);
    }
}