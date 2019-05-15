package com.example.elbowdown;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final Button buttonLogin = findViewById(R.id.button2);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent loginForm = new Intent(LoginActivity.this, LoginFormActivity.class);
//                myIntent.putExtra("key", value); //Optional parameters
                LoginActivity.this.startActivity(loginForm);

            }
        });

        final Button buttonStart = findViewById(R.id.button);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent loginForm = new Intent(LoginActivity.this, LoginFormActivity.class);
//                myIntent.putExtra("key", value); //Optional parameters
                LoginActivity.this.startActivity(loginForm);

            }
        });
    }
}
