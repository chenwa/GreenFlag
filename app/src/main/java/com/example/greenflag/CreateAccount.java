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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        email = findViewById(R.id.activity_create_account_til_email);
        password = findViewById(R.id.activity_create_account_til_password);
        passwordRepeat = findViewById(R.id.activity_create_account_til_password_repeat);

        img1 = findViewById(R.id.activity_create__account_imageView1);

        email.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Perform action on key press
                    img1.setImageResource(R.drawable.cross_2x);
                    return true;
                }
                return false;
            }
        });
    }
}
