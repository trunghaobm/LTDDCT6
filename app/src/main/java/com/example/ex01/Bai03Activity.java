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
import android.text.TextUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bai03Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bai03);

        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSolve = findViewById(R.id.btnSolve);
        EditText txtInput = findViewById(R.id.txtInput);
        TextView txvValues = findViewById(R.id.txvValues);
        TextView txvResult = findViewById(R.id.txvResult);

        ArrayList<Integer> array = new ArrayList<>();

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!txtInput.getText().toString().isEmpty()){
                    array.add(Integer.parseInt(txtInput.getText().toString()));
                    txvValues.setText(TextUtils.join(" ",array));
                    txtInput.setText("");
                }
            }
        });

        btnSolve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(!array.isEmpty()){
                    txvResult.setText(TextUtils.join(" ", OnlyPrimeNumber(array)));
                }
            }
        });
    }

    public int isPrimeNumber(int inputNumber){
        if (inputNumber <= 1) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
            if (inputNumber % i == 0) {
                return 0;
            }
        }

        return 1;
    }

    public ArrayList<Integer> OnlyPrimeNumber(ArrayList<Integer> inputArray){
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer num : inputArray){
            if(isPrimeNumber(num) == 1){
                temp.add(num);
            }
        }

        return temp;
    }
}