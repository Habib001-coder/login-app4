package com.moringaschool.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private EditText ename;
 private EditText epassword;
 private Button button3;

private String Username = "Admin";
private String password = "12345678";

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename = findViewById(R.id.ename);
        epassword = findViewById(R.id.epassword);
        button3 = findViewById(R.id.button3);



        ename.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = ename.getText().toString();
                String inputPassword = epassword.getText().toString();
                if(inputName.isEmpty() || inputPassword.isEmpty()) {



                            Toast.makeText(MainActivity.this, "Please enter all the details correctly", Toast.LENGTH_LONG).show();
                }


            }
        });
private boolean validates(String ename,String password){
    }
}