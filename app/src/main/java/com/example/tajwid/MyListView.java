package com.example.tajwid;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tajwid.Letter;
import com.example.tajwid.R;

import java.util.ArrayList;

public class MyListView extends ArrayAdapter<Letter> {

    MyListView(Activity context, ArrayList<Letter> arrayList)
    {
        super(context, 0,arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Letter letter = getItem(position);
        convertView = LayoutInflater.from(getContext()).
        inflate(R.layout.activity_letter_layout,null,true);

        ImageView imageView=convertView.findViewById(R.id.letterImage);
        TextView textView=convertView.findViewById(R.id.letterName);
        TextView textView1=convertView.findViewById(R.id.letterGroup);

        imageView.setImageResource(letter.getImgId());
        textView.setText(letter.getName());
        textView1.setText(letter.getGroup());
        return convertView;
    }
}
