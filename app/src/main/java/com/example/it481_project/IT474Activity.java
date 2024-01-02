package com.example.it481_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class IT474Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it474);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("it474_slides.pdf").load();
    }
}
