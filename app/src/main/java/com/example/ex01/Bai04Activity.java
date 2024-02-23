package com.example.ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Bai04Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bai04);

        Button btnGenerate = findViewById(R.id.btnGen);
        EditText txtStart = findViewById(R.id.txtStart);
        EditText txtEnd = findViewById(R.id.txtEnd);
        TextView txvShown = findViewById(R.id.txvShown);
        Random random = new Random();

        btnGenerate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(txtStart.getText().toString().isEmpty() || txtEnd.getText().toString().isEmpty()) {
                    int start = Integer.parseInt(txtStart.getText().toString());
                    int end = Integer.parseInt(txtEnd.getText().toString());
                    if(start < end) {
                        txvShown.setText(random.nextInt(end - start + 1) + start);
                    }
                }
            }
        });
    }
}