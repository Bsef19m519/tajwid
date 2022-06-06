package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewLessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_lesson);

        ArrayList<Letter> arrayList = new ArrayList<Letter>();
        arrayList.add(new Letter("ا","حروف مدہ",R.drawable.madda));

        MyListView adapter = new MyListView(this,arrayList);
        ListView listView = findViewById(R.id.customizedList);
        listView.setAdapter(adapter);
    }
}