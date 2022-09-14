package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnLogin;
    EditText edtUser, edtPassWord;
    TextView txtSignup;
    CheckBox cbRemember;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AnhXa();

//        sử lý event btn vào profile
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "admin";
                String password = "admin123";
                if (edtUser.getText().toString().equals(username) && edtPassWord.getText().toString().equals(password)) {
                    Toast.makeText(getApplicationContext(), R.string.loginsucess, Toast.LENGTH_SHORT).show();
                    Intent it = new Intent(Login.this, MainActivity.class);
                    startActivity(it);
                } else {
                    Toast.makeText(getApplicationContext(), R.string.loginerror, Toast.LENGTH_SHORT).show();
                }
            }
        });
//             chuyển sang activity đăng ký
        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Login.this, Signup.class);
                startActivity(it);
            }
        });
    }
    //    ánh xạ id
    private void AnhXa() {
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        edtUser = (EditText) findViewById(R.id.edittextUser);
        edtPassWord = (EditText) findViewById(R.id.edittextPassword);
        txtSignup = (TextView) findViewById(R.id.textviewsignup);
    }
}
