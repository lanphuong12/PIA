package com.example.pia.Study;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pia.R;
import com.github.barteksc.pdfviewer.PDFView;

public class gram_display extends AppCompatActivity {
    PDFView pdfView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pdf);

        pdfView = (PDFView) findViewById(R.id.pdf_viewer);

        Intent intent = getIntent();
        String unit= intent.getStringExtra("ID");

        if (unit.equals("1")){
            pdfView.fromAsset("gram1.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("2")){
            pdfView.fromAsset("gram2.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("3")){
            pdfView.fromAsset("gram3.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("4")){
            pdfView.fromAsset("gram4.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("5")){
            pdfView.fromAsset("gram5.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("6")){
            pdfView.fromAsset("gram6.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("7")){
            pdfView.fromAsset("gram7.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("8")){
            pdfView.fromAsset("gram8.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("9")){
            pdfView.fromAsset("gram9.pdf")
                    .password(null)//enter password if PDF is password protected
                    .defaultPage(0)//set the default page
                    .enableSwipe(true)//enable the swipe to change page
                    .swipeHorizontal(false)//set horizontal swipe to false
                    .enableDoubletap(true)//double tap to zoom
                    .invalidPageColor(Color.WHITE)
                    .load();
        }
        if (unit.equals("10")){
            pdfView.fromAsset("gram10.pdf")
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
