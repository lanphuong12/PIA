package com.example.pia.Study;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Address;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pia.Database;
import com.example.pia.R;

import java.util.ArrayList;

public class unit_choose extends AppCompatActivity {
    final String database_name = "DA3.sqlite";
    SQLiteDatabase database;
    Button vocab, gram, exercise;
    ArrayList<unit_attribute> arr;
    int position;
    String unit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_unit);

        vocab = findViewById(R.id.btn_vocabulary);
        gram = findViewById(R.id.btn_grammar);
        exercise= findViewById(R.id.btn_exercise);

        Intent intent = getIntent();
        unit= intent.getStringExtra("ID");



    }

    public void vocab(View view) {
        Intent in = new Intent(unit_choose.this, vocab_display.class);
        in.putExtra("ID", unit);
        startActivity(in);
    }

    public void gram(View view) {
        Intent in = new Intent(unit_choose.this, gram_display.class);
        in.putExtra("ID", unit);
        startActivity(in);
    }

    public void exercise(View view) {
        Intent in = new Intent(unit_choose.this, exercise.class);
        in.putExtra("ID", arr.get(position).getID());
        startActivity(in);
    }
}
