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

        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    em = email.getText().toString();
                    if (ValidEmail.isValid(em)) {
                        email.setCompoundDrawablesWithIntrinsicBounds(0,0,
                                R.drawable.tick_2x,0);
                    } else {
                        email.setCompoundDrawablesWithIntrinsicBounds(0,0,
                                R.drawable.cross_2x,0);
                    }
                }
            }
        });

        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    pwd = password.getText().toString();
                    if (ValidPassword.isValid(pwd)) {
                        password.setCompoundDrawablesWithIntrinsicBounds(0,0,
                                R.drawable.tick_2x,0);
                    } else {
                        password.setCompoundDrawablesWithIntrinsicBounds(0,0,
                                R.drawable.cross_2x,0);
                    }
                }
            }
        });

        passwordRepeat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    pwdRepeat = passwordRepeat.getText().toString();
                    if (pwdRepeat.equals(pwd)) {
                        passwordRepeat.setCompoundDrawablesWithIntrinsicBounds(0,0,
                                R.drawable.tick_2x,0);
                    } else {
                        passwordRepeat.setCompoundDrawablesWithIntrinsicBounds(0,0,
                                R.drawable.cross_2x,0);
                    }
                }
            }
        });

    }
}
