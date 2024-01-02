package com.example.it481_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class IT476Activity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it476);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("it476_slides.pdf").load();
    }
}