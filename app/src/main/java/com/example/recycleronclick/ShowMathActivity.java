package com.example.recycleronclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ShowMathActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_math);

        pdfView=findViewById(R.id.pdfview);

int getter = getIntent().getIntExtra("geecoders",0);

 if (getter == 0) {
     pdfView.fromAsset("ch1_toroq.pdf").load();
 }

 if (getter == 1) {
     pdfView.fromAsset("ch2_toroq.pdf").load();
 }

 if (getter == 2) {
     pdfView.fromAsset("ch1_toroq.pdf").load();
 }


    }
}