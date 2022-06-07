package com.example.youreyes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE); //remove title
       getSupportActionBar().hide(); // remove heder
    setContentView(R.layout.activity_main);
    btn = findViewById(R.id.inscri);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        }
    });

    }
}