package com.example.pia;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pia.Search.Meanings;
import com.example.pia.Search.meaning_layout;
import com.example.pia.Search.search1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.size;


public class Windown_main extends AppCompatActivity {
    Button search, study, note, demotest;
    AutoCompleteTextView word;
    List<String> listKey_EN_VN = new ArrayList<String>();

    static search1 Obj;
    static Meanings tempEN_VN;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.window_main);
        search = (Button) findViewById(R.id.bt_tk);
        study = (Button) findViewById(R.id.btn_study);
        note = (Button) findViewById(R.id.btn_note);
        demotest = (Button) findViewById(R.id.btn_DEMOtest);
        word = (AutoCompleteTextView) findViewById(R.id.ACTV_tk);
        // Sét đặt số ký tự nhỏ nhất, để cửa sổ gợi ý hiển thị
        ArrayAdapter adapterPrimaryLanguage = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listKey_EN_VN);
        word.setAdapter(adapterPrimaryLanguage);
        // Set đặt số ký tự nhỏ nhất, để cửa sổ gợi ý hiển thị
        word.setThreshold(1);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void bt_search(View view) {

        for (int i=0; i< listKey_EN_VN.size();  i++){
            if (word.equals(tempEN_VN.getPronunciation())){
                Intent in = new Intent(getApplicationContext(), meaning_layout.class);

                startActivity(in);
            }
            else
                Toast.makeText(this, "Nofound!!!", Toast.LENGTH_SHORT).show();
        }
    }

}
