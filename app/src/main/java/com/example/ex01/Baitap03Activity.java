package com.example.ex01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import java.util.ArrayList;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.CompoundButton;

import java.util.Random;


public class Baitap03Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baitap03);

        ArrayList<Integer> BGlist = new ArrayList<>();
        BGlist.add(R.drawable.bg1);
        BGlist.add(R.drawable.bg2);
        BGlist.add(R.drawable.bg3);
        BGlist.add(R.drawable.bg4);

        ChangBG(BGlist);

        Switch sw = findViewById(R.id.sw_background);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton switchbg, boolean isChecked) {
                ChangBG(BGlist);
            }
        });
    };

    protected void ChangBG(ArrayList<Integer> BGlist){
        ConstraintLayout mainlayout = findViewById(R.id.main);
        Random random = new Random();
        int vitri = random.nextInt(BGlist.size());
        mainlayout.setBackgroundResource(BGlist.get(vitri));
    }
}