package com.example.pia;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {
    EditText edt_user,edt_pass, edt_repeat;
    final String database_name = "DA3.sqlite";
    SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        edt_user = (EditText) findViewById(R.id.edt_User);
        edt_pass = (EditText) findViewById(R.id.edt_Pass);
        edt_repeat = (EditText) findViewById(R.id.edt_repeat);
    }

    public void Add(View view){
        Intent in = new Intent(Signup.this, MainActivity.class);
        database = Database.initDatabase(Signup.this,database_name);
        String use=edt_user.getText().toString();
        String pass=edt_pass.getText().toString();
        String repeat=edt_repeat.getText().toString();
        ContentValues cv = new ContentValues();
        cv.put("user",use);
        cv.put("pass",pass);
        if (use.length() == 0||pass.length()==0||repeat.length()==0){
            Toast.makeText(Signup.this, "Thông tin nhập lỗi! Mời nhập lại!", Toast.LENGTH_SHORT).show();
        }
        if (!(pass.equals(repeat))){
            Toast.makeText(Signup.this, "Password không giống nhau! Mời nhập lại!", Toast.LENGTH_SHORT).show();
        }
        else {
            Cursor cursor = database.rawQuery("SELECT * FROM User",null);
            for(int i =0;i<cursor.getCount();++i) {
                cursor.moveToPosition(i);
                String user = cursor.getString(0);
                if (user.equals(use)) {
                    Toast.makeText(this, "Người dùng đã tồn tại. Vui lòng nhập lại!", Toast.LENGTH_SHORT).show();
                }
                else {
                    database.insert("User",null,cv);
                    Toast.makeText(this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                    edt_user.setText("");
                    edt_pass.setText("");
                    startActivity(in);
                }
            }
        }
    }
}
