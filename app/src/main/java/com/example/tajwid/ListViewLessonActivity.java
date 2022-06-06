package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewLessonActivity extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_lesson);

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<Letter> arrayList = new ArrayList<Letter>();
        arrayList.add(new Letter("ا،و،ی","حروف مدہ",R.drawable.madda));
        arrayList.add(new Letter("ۤۤض","حروف حافیہ",R.drawable.hafia));
        arrayList.add(new Letter("ء،ہ،ع،ح،غ،خ","حروف حلقیہ",R.drawable.halaqia));
        arrayList.add(new Letter("ک،ق","حروف لہاتیہ",R.drawable.lahatia));
        arrayList.add(new Letter("ظ،ذ،ث","حروف لسویہ",R.drawable.laswia));
        arrayList.add(new Letter("ت،د،ط","حروف نطعیہ",R.drawable.natia));
        arrayList.add(new Letter("س،ص،ز","حروف صغریہ",R.drawable.sagaria));
        arrayList.add(new Letter("ب،م،و(غیرمدہ)","حروف شفویہ",R.drawable.shafoia));
        arrayList.add(new Letter("ف","حروف شفویہ",R.drawable.shafoia2));
        arrayList.add(new Letter("ج،ش،ی(غیرمدہ)","حروف شجریہ",R.drawable.shajria));
        arrayList.add(new Letter("ل،ن،ر","حروف ذلقیہ",R.drawable.zalqia));

        MyListView adapter = new MyListView(this,arrayList);
        ListView listView = findViewById(R.id.customizedList);
        listView.setAdapter(adapter);
    }
}