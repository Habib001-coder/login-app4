package com.moringaschool.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommentsActivity extends AppCompatActivity {
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        button = findViewById(R.id.apis);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ebutton2();
            }

            private void ebutton2() {
                Intent intent = new Intent( CommentsActivity.this,Constants.class);
                startActivity(intent);
            }
        });

    }
}