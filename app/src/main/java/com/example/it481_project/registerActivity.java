package com.example.it481_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class registerActivity  extends AppCompatActivity  {
    private EditText usernameEditText;


    EditText editUsername;
    EditText editPasswrod;
    DataManager dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);

        //DATABASE
        dm = new DataManager(this);
        Button go_to_login_btn = findViewById(R.id.go_to_login_btn);
        Button register_btn = findViewById(R.id.register_btn);

        usernameEditText = findViewById(R.id.username_editText);
        editUsername = findViewById(R.id.username_editText);
        editPasswrod = findViewById(R.id.editTextNumberPassword);

        go_to_login_btn.setOnClickListener(v -> openloginInterface());

        register_btn.setOnClickListener(v -> registerInsertFunction());
    }


      private void openloginInterface() {
        Intent intent = new Intent(this, long.class);
        startActivity(intent);
        Toast.makeText(this, "Login page opened", Toast.LENGTH_SHORT).show();
    }


     private void registerInsertFunction() {
        dm.insert(editUsername.getText().toString(), editPasswrod.getText().toString());
        dm.showData(dm.selectAll());
        Toast.makeText(this, "Data Inserted", Toast.LENGTH_LONG).show();

        openCourseInterface();
    }

    private void openCourseInterface() {
        String username = usernameEditText.getText().toString();
        CoursesActivity.start(this, username);
    }

}




