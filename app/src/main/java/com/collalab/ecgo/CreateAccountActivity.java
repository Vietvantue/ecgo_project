package com.collalab.ecgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        if(getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

    }
}
