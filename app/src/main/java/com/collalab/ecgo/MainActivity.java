package com.collalab.ecgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    View btnCreateAccount, btnForgotPwd, btnReport, btnTopUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreateAccount = findViewById(R.id.btn_create_account);
        btnForgotPwd = findViewById(R.id.btn_forgot_password);
        btnReport = findViewById(R.id.btn_report);
        btnTopUp = findViewById(R.id.btn_top_up);

        btnCreateAccount.setOnClickListener(this);
        btnForgotPwd.setOnClickListener(this);
        btnReport.setOnClickListener(this);
        btnTopUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_create_account:
                intent = new Intent(MainActivity.this,CreateAccountActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_forgot_password:
                break;
            case R.id.btn_report:
                break;
            case R.id.btn_top_up:
                break;
        }
    }
}
