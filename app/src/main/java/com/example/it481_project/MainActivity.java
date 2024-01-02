package com.example.it481_project;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usernameEditText = findViewById(R.id.EditText1);
        Button login_btn = findViewById(R.id.login_btn);
        Button go_to_register_btn = findViewById(R.id.go_to_register_btn);
        Button forget_password_btn = findViewById(R.id.forget_password_btn);

        login_btn.setOnClickListener(v -> showLoginSuccessDialog());
        forget_password_btn.setOnClickListener(v -> openForgetPasswordInterface());
        go_to_register_btn.setOnClickListener(v -> openRegisterInterface());


        //Show sso help PDF
        Button sso_help_btn = findViewById(R.id.sso_help_btn);
        sso_help_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, sso_help_activity.class);
                startActivity(intent);
            }
        });



    }


        private void showLoginSuccessDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Login Successful");
        builder.setMessage("You have successfully logged in!");
        builder.setPositiveButton("OK", (dialog, id) -> {
            dialog.dismiss();
            openCourseInterface();
        });
        Dialog dialog = builder.create();
        dialog.show();
    }
    private void openCourseInterface() {
        String username = usernameEditText.getText().toString();
        CoursesActivity.start(this, username);
    }

    private void openForgetPasswordInterface() {
        Intent intent = new Intent(this, ForgetPasswordActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Forget Password Clicked", Toast.LENGTH_SHORT).show();
    }

    private void openRegisterInterface() {
        Intent intent = new Intent(this, registerActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Register page opened", Toast.LENGTH_SHORT).show();
    }


}



