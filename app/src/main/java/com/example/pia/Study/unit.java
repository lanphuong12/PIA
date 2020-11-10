package com.example.pia.Study;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import com.example.pia.Database;
import com.example.pia.R;

import java.text.ParseException;
import java.util.ArrayList;

public class unit extends AppCompatActivity {
    final String database_name = "DA3.sqlite";
    SQLiteDatabase database;
    ArrayList<unit_attribute> arr;
    unit_adapter adapter;
    ListView lv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study_main);
        lv = (ListView) findViewById(R.id.lv_study);
        arr= new ArrayList<>();
        adapter= new unit_adapter(this, arr);
        lv.setAdapter(adapter);
        readData();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in = new Intent(unit.this, unit_choose.class);
                in.putExtra("ID", arr.get(i).getID());
                startActivity(in);
            }
        });

    }


    private void readData() {
        database = Database.initDatabase(unit.this,database_name);
        Cursor cursor = database.rawQuery("SELECT * FROM Unit_main",null);
        arr.clear();
        for(int i =0;i<cursor.getCount();i++){
            cursor.moveToPosition(i);
            String id = cursor.getString(0);
            String name = cursor.getString(2);
            byte[] img = cursor.getBlob(3);

            arr.add(new unit_attribute(id,name, img));
        }
        adapter.notifyDataSetChanged();
    }
}
