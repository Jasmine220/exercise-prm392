package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnLogin;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = (EditText) findViewById(R.id.editTextEmailOrPhone);
        txtPassword = (EditText) findViewById(R.id.editTextPassword);
        System.out.println("txtEmail: " + txtEmail);
        System.out.println("txtPassword: " + txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignup = (Button) findViewById(R.id.btnSignupFacebook);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString();
                int flag = 0;
                for (int i = 0; i < RegisterActivity.accounts.size(); i++) {
                    if (RegisterActivity.accounts.get(i).getPhoneOrEmail().equals(email) &&
                            RegisterActivity.accounts.get(i).getPassword().equals(password)) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    Toast.makeText(MainActivity.this, "Login successful !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, HomeActivity.class);
                    intent.putExtra("email", email);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "User or password not valid !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    protected void onPause(){
super.onPause();
txtEmail.setText("");
txtPassword.setText("");

    }
}