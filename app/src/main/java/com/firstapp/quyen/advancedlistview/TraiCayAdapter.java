package com.firstapp.quyen.advancedlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<TraiCay> listTraiCay;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> listTraiCay) {
        this.context = context;
        this.layout = layout;
        this.listTraiCay = listTraiCay;
    }

    @Override
    public int getCount() {
        return listTraiCay.size();  // Hien thi so luong item ta muon.
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);

        //Anhxa
        ImageView imgView = convertView.findViewById(R.id.imageView);
        TextView txtViewTen = convertView.findViewById(R.id.textViewTen);
        TextView txtViewMota = convertView.findViewById(R.id.textViewMota);

        TraiCay traicay = listTraiCay.get(position);
        imgView.setImageResource(traicay.getHinh());
        txtViewMota.setText(traicay.getTen());
        txtViewTen.setText(traicay.getTen());
        return convertView;
    }
}
