package com.example.tajwid;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyQuizAdapter extends ArrayAdapter<MultipleChoiceQuestion> {

    public MyQuizAdapter(@NonNull Context context, ArrayList<MultipleChoiceQuestion> arrayList) {
        super(context, 0,arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MultipleChoiceQuestion mcq = getItem(position);
        MultipleChoiceQuestion mcq2 = getItem(position);
        convertView= LayoutInflater.from(getContext())
                .inflate(R.layout.activity_quiz_layout,null,true);

        TextView title=convertView.findViewById(R.id.Title);
        TextView body=convertView.findViewById(R.id.Body);
        RadioButton radioA=convertView.findViewById(R.id.radioA);
        RadioButton radioB=convertView.findViewById(R.id.radioB);
        RadioButton radioC=convertView.findViewById(R.id.radioC);
        RadioButton radioD=convertView.findViewById(R.id.radioD);
        Button doneButton=convertView.findViewById(R.id.doneButton);
        RadioGroup radioGroup=convertView.findViewById(R.id.rGroup);

        title.setText(mcq.getTitle());
        body.setText(mcq.getQuestion());
        radioA.setText(mcq.getOptionA());
        radioB.setText(mcq.getOptionB());
        radioC.setText(mcq.getOptionC());
        radioD.setText(mcq.getOptionD());
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mcq.getCorrectOption()==radioGroup.getCheckedRadioButtonId()) mcq.setCorrect(true);
                doneButton.setEnabled(false);
                radioA.setEnabled(false);
                radioB.setEnabled(false);
                radioC.setEnabled(false);
                radioD.setEnabled(false);
            }
        });
        return convertView;
    }
}
