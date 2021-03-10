package com.example.activty2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edEmail, edPassword;

    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);

        edEmail = findViewById(R.id.edEmail);

        edPassword = findViewById(R.id.edPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edEmail.getText().toString();
                password = edPassword.getText().toString();

                if(edEmail.getText().toString().equals("aku@mail.com")&&edPassword.getText().toString().equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN BERHASIL  email : " + nama + " password : " + password + "", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (!edEmail.getText().toString().equals("aku@mail.com")&&edPassword.getText().toString().equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Email salah ", Toast.LENGTH_SHORT);
                    t.show();
                }
                else if (!edPassword.getText().toString().equals("123")&&edEmail.getText().toString().equals("akun@mail.com")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            " Password salah ", Toast.LENGTH_SHORT);
                    t.show();
                }
                else{
                    Toast.makeText((getApplicationContext()), "Email  atau Password Anda Salah",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


