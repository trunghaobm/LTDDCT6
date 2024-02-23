package com.example.ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class Bai05Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bai05);

        Button btnGenerate = findViewById(R.id.btnGenerate);
        TextView txvShow = findViewById(R.id.txvShow);
        Random random = new Random();

        btnGenerate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               txvShow.setText(random.nextInt(1000) + 1);
            }
        });
    }
}