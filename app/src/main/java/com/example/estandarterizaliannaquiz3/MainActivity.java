package com.example.estandarterizaliannaquiz3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etName);
        txtPassword = findViewById(R.id.etPassword);
        txtEmail = findViewById(R.id.etEmail);

    }

    public void  goLogin (View v) {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public  void onRegister(View v) {
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("user",txtName.getText().toString());
        editor.putString("pwd",txtPassword.getText().toString());
        editor.putString("email",txtEmail.getText().toString());
        editor.commit();
        Toast.makeText(this,"User is saved in userInfo.xml1",Toast.LENGTH_LONG).show();
    }
}
