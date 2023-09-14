package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    private EditText txtPhoneOrEmail;
    private EditText txtNewPassword;

    private Button btnSignup;

    public static ArrayList<Account> accounts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtPhoneOrEmail = (EditText) findViewById(R.id.editTextPhoneOrEmail);
        txtNewPassword = (EditText) findViewById(R.id.editTextNewPassword);
        btnSignup = (Button) findViewById(R.id.btnSignupFacebook);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Account acc = new Account(txtPhoneOrEmail.getText().toString(),
                        txtNewPassword.getText().toString());
                Toast.makeText(RegisterActivity.this, "You already signed up !", Toast.LENGTH_SHORT).show();
                accounts.add(acc);
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}