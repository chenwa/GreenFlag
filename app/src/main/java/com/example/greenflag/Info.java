package com.example.greenflag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Info extends AppCompatActivity {
    EditText etname;
    EditText etUserName;
    EditText etPassword;
    Button btnChangePhoto;
    EditText etAge;

    RadioGroup gender;
    RadioButton btnFemale;
    RadioButton btnMale;
    RadioButton btnNS;

    EditText etPostal;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        etname = findViewById(R.id.info_name);
        etUserName = findViewById(R.id.info_Username);
        etPassword = findViewById(R.id.info_password);
        btnChangePhoto = findViewById(R.id.activity_info_btn_change_photo);
        etAge = findViewById(R.id.info_age);

        gender = findViewById(R.id.info_radio_group);
        btnFemale = findViewById(R.id.info_radio_opt1);
        btnMale = findViewById(R.id.info_radio_opt2);
        btnNS = findViewById(R.id.info_radio_opt3);

        etPostal = findViewById(R.id.info_et_postal);
        btnSave = findViewById(R.id.activity_info_btn_save);


        //TODO gather information and make it usable in parcelable form
    }
}
