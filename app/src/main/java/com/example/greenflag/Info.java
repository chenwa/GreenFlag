package com.example.greenflag;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Info extends AppCompatActivity {
    public static final String USER_INFO_KEY = Info.class.
            getSimpleName() + "KEY";

    EditText etName;
    EditText etUserName;
    EditText etPassword;
    Button btnChangePhoto;
    EditText etAge;

    TextView tvCalendar;
    DatePickerDialog picker;

    Spinner spinCountry;
    RadioGroup rgGender;
    RadioButton btnFemale;
    RadioButton btnMale;
    RadioButton btnNS;

    EditText etPostal;
    Button btnSave;

    private String name;
    private String userName;
    private String password;
    //private ImageView picture;
    private String age = "Age: N/A";
    private String birthday = "Birthday: N/A";
    private String country = "Country: N/A";
    private String gender = "Gender: Not specified";
    private String postal = "Postal: N/A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        etName = findViewById(R.id.info_name);
        etUserName = findViewById(R.id.info_Username);
        etPassword = findViewById(R.id.info_password);
        btnChangePhoto = findViewById(R.id.activity_info_btn_change_photo);
        etAge = findViewById(R.id.info_age);

        tvCalendar = findViewById(R.id.activity_info_tv_datepicker);
        spinCountry = findViewById(R.id.info_spinner_country);
        rgGender = findViewById(R.id.info_radio_group);
        btnFemale = findViewById(R.id.info_radio_opt1);
        btnMale = findViewById(R.id.info_radio_opt2);
        btnNS = findViewById(R.id.info_radio_opt3);

        etPostal = findViewById(R.id.info_et_postal);
        btnSave = findViewById(R.id.activity_info_btn_save);

        password = getIntent().getStringExtra("password");

        etPassword.setText(password);

        // Calendar
        tvCalendar.setOnClickListener(v -> {
            final Calendar c = Calendar.getInstance();
            final int year = c.get(Calendar.YEAR);
            final int month = c.get(Calendar.MONTH);
            final int day = c.get(Calendar.DAY_OF_MONTH);
            picker = new DatePickerDialog(Info.this,
                    (view, year1, monthOfYear, dayOfMonth) -> {
                        birthday = (monthOfYear + 1) + " " + dayOfMonth + " " + year1;
                        tvCalendar.setText(birthday);
                    }, year, month, day);
            picker.show();
        });

        // Gender radio buttons
        rgGender.setOnCheckedChangeListener((arg0, id) -> {
            switch (id) {
                case R.id.info_radio_opt1:
                    gender= "Female";
                    break;
                case R.id.info_radio_opt2:
                    gender= "Male";
                    break;
                case R.id.info_radio_opt3:
                    gender= "Not specified";
                    break;
            }

        });
    }

    // Navigates us to the createAccount activity
    public void navigateToAccounts(View view) {

        name = etName.getText().toString();
        userName = etUserName.getText().toString();
        // TODO: password = ...
        // TODO: picture = ...
        age = etAge.getText().toString();
        // TODO: birthday = ...
        country = spinCountry.getSelectedItem().toString();
        postal = etPostal.getText().toString();


        // Collect info
        Intent intent = new Intent(this, Accounts.class);

        User user = new User();

        user.setName(name);
        user.setUserName(userName);
        user.setPassword(password);
        user.setAge(age);
        user.setBirthday(birthday);
        user.setCountry(country);
        user.setGender(gender);
        user.setPostal(postal);

        intent.putExtra(USER_INFO_KEY, user);
        startActivity(intent);
    }
}
