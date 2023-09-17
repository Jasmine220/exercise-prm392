package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView txtName;
    private Button btnCloseHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txtName = (TextView) findViewById(R.id.txtNameHome);
        btnCloseHome = (Button)findViewById(R.id.btnClose);
        txtName.setText("Hello " + getIntent().getStringExtra("email"));
        btnCloseHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity.this.finish();
            }
        });
    }
}