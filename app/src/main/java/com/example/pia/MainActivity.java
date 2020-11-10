package com.example.pia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    EditText edtuser, edtpassword;
    String use, passW;
    final String database_name = "DA3.sqlite";
    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtuser = (EditText) findViewById(R.id.ed_user);
        edtpassword = (EditText) findViewById(R.id.ed_pass);
    }
    public void Create(View view){
        Intent intent = new Intent(MainActivity.this, Signup.class);
        startActivity(intent);
    }
    public void Login(View view){
        Intent in = new Intent(MainActivity.this, MainActivity.class);
        database = Database.initDatabase(MainActivity.this,database_name);
        use=edtuser.getText().toString();
        passW=edtpassword.getText().toString();
        //Kiểm tra tài khoản, mật khẩu đã có ký tự nào chưa
        if (use.length() == 0||passW.length()==0){
            Toast.makeText(MainActivity.this, "Thông tin nhập lỗi! Mời nhập lại!", Toast.LENGTH_SHORT).show();
        }
        else {
            Cursor check_user = database.rawQuery("SELECT * FROM User ",null);
            //Kiểm tra xem đúng tên tài khoản, mật khẩu người dùng hay không
            for(int i =0;i<check_user.getCount();++i) {
                check_user.moveToPosition(i);
                String user = check_user.getString(0);
                String pass = check_user.getString(1);
                if (user.equals(use) && pass.equals(passW)) {
                    Toast.makeText(this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                    startActivity(in);
                } else {
                    Toast.makeText(this, "Đăng nhập thất bại!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
    public void Exit(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Bạn có chắc muốn thoát khỏi ứng dụng?");
        alert.setMessage("Chọn 'Yes' để xác nhận!");
        alert.setIcon(android.R.drawable.ic_dialog_alert);
        //Tạo biến mới để bắt sự kiện
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);//Thoát khỏi app
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alert.show();
    }
}
