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
                radioButton.setEnabled(false);
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton4.setEnabled(false);
                Next.setEnabled(true);
                nextSetting();
            }
        });
    }
    private void nextSetting()
    {
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Done.setEnabled(true);
                radioButton.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
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
        Question.setText("???????? ???????? ???? ?????????????? ??????????");
        radioButton.setText("??");
        radioButton2.setText("??");
        radioButton3.setText("??");
        radioButton4.setText("??");
        doneSetting(radioButton);
    }
    private void q2()
    {
        Q_No.setText("Q2");
        Question.setText("?????????? ???????? ???? ?????? ???? ???????? ?????? ???????? ???? ???????? ?????????? ???????????? ???? ???????????? ?? ??????????");
        radioButton.setText("??");
        radioButton2.setText("??");
        radioButton3.setText("??");
        radioButton4.setText("??");
        doneSetting(radioButton4);
    }
    private void q3()
    {
        Q_No.setText("Q3");
        Question.setText("???????????? ?????? ?????? ???? ?????????? ?????? ???????? ?????????? ???????? ??????");
        radioButton.setText("??");
        radioButton2.setText("??");
        radioButton3.setText("??");
        radioButton4.setText("??");
        doneSetting(radioButton2);
    }
    private void q4()
    {
        Q_No.setText("Q4");
        Question.setText("???????????????? ?????????? ???????????? ???? ???????????? ?????? ???????? ??????");
        radioButton.setText("??");
        radioButton2.setText("??");
        radioButton3.setText("??");
        radioButton4.setText("??");
        doneSetting(radioButton2);
    }
    private void q5()
    {
        Q_No.setText("Q5");
        Question.setText("???????? ?????????? ???? ?????????????? ??????????");
        radioButton.setText("??");
        radioButton2.setText("??");
        radioButton3.setText("??");
        radioButton4.setText("??");
        doneSetting(radioButton3);
    }
}