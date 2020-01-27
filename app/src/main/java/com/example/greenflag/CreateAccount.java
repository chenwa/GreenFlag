package com.example.greenflag;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class CreateAccount extends AppCompatActivity {

    EditText email;
    EditText password;
    EditText passwordRepeat;
    Button btn;

    ImageView img1;
    ImageView img2;
    ImageView img3;

    String em;
    String pwd;
    String pwdRepeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        email = findViewById(R.id.activity_create_account_til_email);
        password = findViewById(R.id.activity_create_account_til_password);
        passwordRepeat = findViewById(R.id.activity_create_account_til_password_repeat);

        img1 = findViewById(R.id.activity_create__account_imageView1);
        img2 = findViewById(R.id.activity_create__account_imageView2);
        img3 = findViewById(R.id.activity_create__account_imageView3);


        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    em = email.getText().toString();
                    if (ValidEmail.isValid(em)) {
                        img1.setImageResource(R.drawable.tick_2x);
                    } else {
                        img1.setImageResource(R.drawable.cross_2x);
                    }
                    img1.setVisibility(View.VISIBLE);
                }
            }
        });

        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    pwd = password.getText().toString();
                    if (ValidPassword.isValid(pwd)) {
                        img2.setImageResource(R.drawable.tick_2x);
                    } else {
                        img2.setImageResource(R.drawable.cross_2x);
                    }
                    img2.setVisibility(View.VISIBLE);
                }
            }
        });

        passwordRepeat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    pwdRepeat = passwordRepeat.getText().toString();
                    if (pwdRepeat.equals(pwd)) {
                        img3.setImageResource(R.drawable.tick_2x);
                    } else {
                        img3.setImageResource(R.drawable.cross_2x);
                    }
                    img3.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
