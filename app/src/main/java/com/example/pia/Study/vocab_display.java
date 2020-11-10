package com.example.pia.Study;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pia.R;
import com.github.barteksc.pdfviewer.PDFView;

public class vocab_display extends AppCompatActivity {

    PDFView pdfView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pdf);

        pdfView = (PDFView) findViewById(R.id.pdf_viewer);

        Intent intent = getIntent();
        String unit= intent.getStringExtra("ID");

        if (unit.equals("1")){
            pdfView.fromAsset("vocab1.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("2")){
            pdfView.fromAsset("vocab2.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("3")){
            pdfView.fromAsset("vocab3.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("4")){
            pdfView.fromAsset("vocab4.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("5")){
            pdfView.fromAsset("vocab5.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("6")){
            pdfView.fromAsset("vocab6.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("7")){
            pdfView.fromAsset("vocab7.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("8")){
            pdfView.fromAsset("vocab8.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("9")){
            pdfView.fromAsset("vocab9.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("10")){
            pdfView.fromAsset("vocab10.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }

    }
}
