package com.example.tajwid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
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
        convertView= LayoutInflater.from(getContext())
                .inflate(R.layout.activity_quiz_layout,null,true);

        TextView title=convertView.findViewById(R.id.Title);
        TextView body=convertView.findViewById(R.id.Body);
        RadioButton radioA=convertView.findViewById(R.id.radioA);
        RadioButton radioB=convertView.findViewById(R.id.radioB);
        RadioButton radioC=convertView.findViewById(R.id.radioC);
        RadioButton radioD=convertView.findViewById(R.id.radioD);

        title.setText(mcq.getTitle());
        body.setText(mcq.getQuestion());
        radioA.setText(mcq.getOptionA());
        radioB.setText(mcq.getOptionB());
        radioC.setText(mcq.getOptionC());
        radioD.setText(mcq.getOptionD());
        return convertView;
    }
}
