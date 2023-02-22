package com.if4a.cobalogin;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;
    private String username, password;
    KendaliLogin KL = new KendaliLogin();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);

        btnLogin = findViewById(R.id.btn_login);
    }

    public void prosesLogin(View view){
        username = etUsername.getText().toString();
        password = etPassword.getText().toString();

        if (username.equals("admin") && password.equals("admin")){
            KL.setPref(LoginActivity.this, "spPadang", username);
            startActivity(new Intent (LoginActivity.this, MainActivity.class));
            finish();
        }else{
            Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_LONG).show();
        }
    }
}