package com.example.it481_project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ForgetPasswordActivity extends AppCompatActivity {

        public static void start(Context context) {
            Intent intent = new Intent(context, ForgetPasswordActivity.class);
            context.startActivity(intent);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.forget_password);
        }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();} }

