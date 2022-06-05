package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    TextView Q_No,Question,result,correctAnswer;
    RadioButton radioButton,radioButton2,radioButton3,radioButton4;
    RadioGroup radioGroup;
    Button Done,Next;
    int score,total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        score=0;
        total=0;

        Q_No=findViewById(R.id.Q_No);
        Question=findViewById(R.id.Question);

        radioButton=findViewById(R.id.radioButton);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton4=findViewById(R.id.radioButton4);
        radioGroup=findViewById(R.id.radioGroup);

        result=findViewById(R.id.result);
        correctAnswer=findViewById(R.id.correctAnswer);
        Done=findViewById(R.id.button5);
        Next=findViewById(R.id.button6);
        q1();
        nextSetting();
    }
    private void doneSetting(RadioButton rb){
        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioGroup.getCheckedRadioButtonId()==-1) return;
                if(rb.isChecked()) {
                    score++;
                    result.setText("Correct");
                    result.setBackgroundResource(android.R.color.holo_green_light);
                }
                else{
                    result.setText("Wrong");
                    result.setBackgroundResource(android.R.color.holo_red_light);
                    correctAnswer.setText("Correct Answer:\t".concat(rb.getText().toString()));
                }
                total++;
                Done.setEnabled(false);
                radioGroup.setEnabled(false);
                Next.setEnabled(true);
            }
        });
    }
    private void nextSetting()
    {
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioGroup.setEnabled(true);
                Done.setEnabled(true);
                if(total==1) q2();
                else if(total==2) q3();
                else if(total==3) q4();
                else if(total==4) q5();
                else if(total==5){
                    Intent intent = new Intent(TestActivity.this,ResultActivity.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }
                Next.setEnabled(false);
                if(radioGroup.getCheckedRadioButtonId()!=-1)
                {
                    RadioButton temp=findViewById(radioGroup.getCheckedRadioButtonId());
                    temp.setChecked(false);
                }
            }
        });
    }
    private void q1()
    {
        Q_No.setText("Q1");
        Question.setText("حروف حلقی کی نشاندہی کریں۔");
        radioButton.setText("ح");
        radioButton2.setText("ق");
        radioButton3.setText("ک");
        radioButton4.setText("پ");
        doneSetting(radioButton);
    }
    private void q2()
    {
        Q_No.setText("Q2");
        Question.setText("مخرج؛ زبان کی نوک جب اوپر اور نیچے کے اگلے دونوں دانتوں کے درمیان آ جاےٴ۔");
        radioButton.setText("و");
        radioButton2.setText("ی");
        radioButton3.setText("ل");
        radioButton4.setText("ص");
        doneSetting(radioButton4);
    }
    private void q3()
    {
        Q_No.setText("Q3");
        Question.setText("مندرجہ ذیل میں سے کونسا حرف حروف ذلقیہ نہیں ہے۔");
        radioButton.setText("ل");
        radioButton2.setText("ف");
        radioButton3.setText("ن");
        radioButton4.setText("ر");
        doneSetting(radioButton2);
    }
    private void q4()
    {
        Q_No.setText("Q4");
        Question.setText("ۛۛۛمخرج؛ دونوں ہونٹوں کی بیرونی تری ملنے سے۔");
        radioButton.setText("ن");
        radioButton2.setText("م");
        radioButton3.setText("ب");
        radioButton4.setText("و");
        doneSetting(radioButton2);
    }
    private void q5()
    {
        Q_No.setText("Q5");
        Question.setText("حروف نطعیہ کی نشاندہی کریں۔");
        radioButton.setText("ب");
        radioButton2.setText("ق");
        radioButton3.setText("د");
        radioButton4.setText("ز");
        doneSetting(radioButton3);
    }
}