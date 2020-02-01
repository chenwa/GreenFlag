package com.example.greenflag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Accounts extends AppCompatActivity {
    private static final String TAG = "Accounts";

    RecyclerView recyclerView;

    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);

        // Recycler View
        recyclerView = findViewById(R.id.accounts_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Adapter
        adapter = new UserAdapter();
        recyclerView.setAdapter(adapter);


        // Enter user into our fake Database

        User user = new User();

        user = getIntent().getParcelableExtra(Info.USER_INFO_KEY);

        FakeDatabase.db.add(user);

        adapter.setDataSet(FakeDatabase.db);
    }
}
