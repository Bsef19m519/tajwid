package com.example.tajwid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button repoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repoButton=findViewById(R.id.button);
        repoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String repoAddress = "https://github.com/Bsef19m519/tajwid";
                openWebPage(repoAddress);
            }
        });
    }
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }
}