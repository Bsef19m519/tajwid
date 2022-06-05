package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    TextView Q_No,Question,result,correctAnswer;
    RadioButton radioButton,radioButton2,radioButton3,radioButton4;
    Button Done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Q_No=findViewById(R.id.Q_No);
        Question=findViewById(R.id.Question);
        Q_No.setText("1");
        Question.setText("حروف حلقی کی نشاندہی کریں۔");

        radioButton=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton4=findViewById(R.id.radioButton4);

        String correct="ح";
        radioButton.setText(correct);
        radioButton2.setText("ق");
        radioButton3.setText("ک");
        radioButton4.setText("پ");

        result=findViewById(R.id.result);
        correctAnswer=findViewById(R.id.correctAnswer);
        Done=findViewById(R.id.button5);
        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioButton.isChecked()) {
                    result.setText("Correct");
                    result.setBackgroundResource(android.R.color.holo_green_light);
                }
                else{
                    result.setText("Wrong");
                    result.setBackgroundResource(android.R.color.holo_red_light);
                    correctAnswer.setText("Correct Answer:\t".concat(correct));
                }
                Done.setEnabled(false);
            }
        });
    }
}