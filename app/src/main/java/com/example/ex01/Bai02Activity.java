package com.example.ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

public class Bai02Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bai02);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText username = findViewById(R.id.txtUsername);
                EditText password = findViewById(R.id.txtPassword);

                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(Bai02Activity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Bai02Activity.this, "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}