package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView yourScore,remarks;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        yourScore=findViewById(R.id.yourScore);
        remarks=findViewById(R.id.remarks);
        btn=findViewById(R.id.button7);
        setup();
    }
    private void setup()
    {
        int score = getIntent().getIntExtra("score",0);
        yourScore.setText(yourScore.getText().toString().concat(String.valueOf(score)));
        String rem="";
        if(score==0) rem.concat("Very Poor. You need to improve.");
        else if(score==1) rem.concat("Work Hard. You can do better.");
        else if(score==2) rem.concat("Average Score.");
        else if(score==3) rem.concat("Good Job. Keep Learning.");
        else if(score==4) rem.concat("V.Good Score.");
        else if(score==5) rem.concat("Excellent Work. You got highest score.");
        remarks.setText(remarks.getText().toString().concat(rem));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}