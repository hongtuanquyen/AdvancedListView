package com.firstapp.quyen.advancedlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lstViewTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstViewTraiCay = findViewById(R.id.listViewTraiCay);
        arrayTraiCay = new ArrayList<>();
        arrayTraiCay.add(new TraiCay("Xoài","Xoài cát Hòa Lộc",R.drawable.xoaicat_hoaloc));
        arrayTraiCay.add(new TraiCay("Dưa Hấu","Dưa hấu ruột vàng", R.drawable.duahau_ruotvang));
        arrayTraiCay.add(new TraiCay("Sầu Riêng", "Sầu riêng Cái Mơn",R.drawable.saurieng_caimon));

        adapter = new TraiCayAdapter(MainActivity.this, R.layout.dong_trai_cay,arrayTraiCay);
        lstViewTraiCay.setAdapter(adapter);
    }
}
