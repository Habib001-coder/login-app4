package com.moringaschool.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//public class HomepageActivity extends AppCompatActivity {
//private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        button = findViewById(R.id.ebutton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ebutton2();
            }

            private void ebutton2() {
                Log.e("TAG","Button to comments activity");
                Intent intent = new Intent( HomepageActivity.this,CommentsActivity.class);
                startActivity(intent);
            }
        });

    }
}