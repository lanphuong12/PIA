package com.example.pia.Search;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pia.R;

public class meaning_layout extends AppCompatActivity {
    TextView word, mean;
    AutoCompleteTextView words;

    static search1 Obj;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meaning_word);

        word = findViewById(R.id.tv_word);
        mean = findViewById(R.id.tv_mean);

        Meanings tempEN_VN = Obj.LookUpEN_VN(words);

        word.setText(tempEN_VN.getPronunciation());
        mean.setText(tempEN_VN.getAttribute() + "\n" + tempEN_VN.getListWordtrans());

    }
}
