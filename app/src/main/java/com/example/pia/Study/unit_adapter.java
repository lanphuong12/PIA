package com.example.pia.Study;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pia.R;

import java.util.ArrayList;

public class unit_adapter extends BaseAdapter {
    Activity cont;
    ArrayList<unit_attribute> arr;

    public unit_adapter(Activity cont, ArrayList<unit_attribute> arr) {
        this.cont = cont;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inf= (LayoutInflater) cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inf.inflate(R.layout.adapter_unit,null);
        TextView tv_unit = (TextView) row.findViewById(R.id.tv_unit);
        TextView tv_name = (TextView) row.findViewById(R.id.tv_name_unit);
        ImageView img = (ImageView)  row.findViewById(R.id.imageView);

        unit_attribute cus = arr.get(position);
        tv_unit.setText(cus.getID());
        tv_name.setText(cus.getName());
        Bitmap imag = BitmapFactory.decodeByteArray(cus.img,0,cus.img.length);
        img.setImageBitmap(imag);
        return row;
    }
}
