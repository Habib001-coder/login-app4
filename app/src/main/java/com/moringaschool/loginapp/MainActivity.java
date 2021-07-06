package com.moringaschool.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
 import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static androidx.constraintlayout.motion.widget.TransitionBuilder.validate;

public class MainActivity<passwaord> extends AppCompatActivity {
    private EditText ename;
    private EditText epassword;
    private Button button3;
    private TextView eattempt;

    private String Username = "Admin";
    private String password = "12345678";


    boolean isValid = false;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename = findViewById(R.id.ename);
        epassword = findViewById(R.id.epassword);
        button3 = findViewById(R.id.button3);
        eattempt = findViewById(R.id.eattempt);

        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public int hashCode() {
//                return super.hashCode();
//            }

            @Override
            public void onClick(View v) {
                String inputName = ename.getText().toString();
                String inputPassword = epassword.getText().toString();
                if (inputName.isEmpty() || inputPassword.isEmpty()) {


                    Toast.makeText(MainActivity.this, "Please enter all the details correctly", Toast.LENGTH_LONG).show();
                } else {
                    isValid = validate(inputName, inputPassword);
                    if (!isValid)
                        (
                        counter -- ;




                    Toast.makeText(MainActivity.this, "Incorrect credential entered", Toast.LENGTH_LONG).show();

                    if (counter == 0) ;

                    button3.setEnabled(false);


                }

            }else

            {

                Toast.makeText(MainActivity.this, "Login was successful", Toast.LENGTH_LONG).show();
//                 Add the code to new activity
                Intent intent = new Intent(MainActivity.this, HomepageActivity.class);
                startActivity(intent);
            }





        });
    }

    private boolean validate(String name, String Passwaord) {
        if (button3.equals(Username) && Passwaord.equals(password)) {
            return true;
        }
        return false;
    }


}