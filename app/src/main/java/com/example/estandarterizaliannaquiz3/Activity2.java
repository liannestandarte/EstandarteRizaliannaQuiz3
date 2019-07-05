package com.example.estandarterizaliannaquiz3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    EditText txtName, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
            txtName = findViewById(R.id.tvName);
            txtPassword = findViewById(R.id.tvPassword);
        }

        public void goRegister(View v) {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }

        public void onLogin (View v) {
            SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
            txtName.setText(sp.getString("user",""));
            txtPassword.setText(sp.getString("pwd",""));
            Toast.makeText(this,"Email is " + sp.getString("email",""),Toast.LENGTH_LONG).show();

        }
}
