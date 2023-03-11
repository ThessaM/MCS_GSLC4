package com.example.a2501974391_mcs_gslc_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView email;
    TextView password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editTextTextEmailAddress_Login_Email);
        password = findViewById(R.id.editTextTextPassword_Login_Password);
        loginBtn = findViewById(R.id.button_Login);

        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(email.getText().toString().length() == 0 && password.getText().toString().length() == 0){
            Toast.makeText(this, "Email and Password must be filled", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
            Intent goToHome = new Intent(this, HomePage.class);
            startActivity(goToHome);
        }
    }
}