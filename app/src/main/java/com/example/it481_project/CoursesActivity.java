package com.example.it481_project;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
       public class CoursesActivity extends AppCompatActivity {

        public static final String EXTRA_USERNAME = "extra_username";

        public static void start(Context context, String username) {
            Intent intent = new Intent(context, CoursesActivity.class);
            intent.putExtra(EXTRA_USERNAME, username);
            context.startActivity(intent);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.course_page);

            TextView welcomeTextView = findViewById(R.id.textView1);
            // Get the username passed from the first interface
            String username = getIntent().getStringExtra(EXTRA_USERNAME);
            // Set the welcome message in the second interface
            welcomeTextView.setText(getString(R.string.welcome_message, username));


            //Show IT474 PDF
            ImageButton it474_btn = findViewById(R.id.it474_btn);
            it474_btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(CoursesActivity.this, IT474Activity.class);
                    startActivity(intent);
                }
            });

            //Show IT475 PDF
            ImageButton it475_btn = findViewById(R.id.it475_btn);
            it475_btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(CoursesActivity.this, IT475Activity.class);
                    startActivity(intent);
                }
            });


            //Show IT476 PDF
            ImageButton it476_btn = findViewById(R.id.it476_btn);
            it476_btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(CoursesActivity.this, IT476Activity.class);
                    startActivity(intent);
                }
            });

            //Show IT478 PDF
            ImageButton it478_btn = findViewById(R.id.it478_btn);
            it478_btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(CoursesActivity.this, IT478Activity.class);
                    startActivity(intent);
                }
            });

            //Show IT487 PDF
            ImageButton it487_btn = findViewById(R.id.it487_btn);
            it487_btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(CoursesActivity.this, IT487Activity.class);
                    startActivity(intent);
                }
            });

        }
           @Override
           public void onBackPressed() {
               super.onBackPressed();
               finish();
        }
    }
