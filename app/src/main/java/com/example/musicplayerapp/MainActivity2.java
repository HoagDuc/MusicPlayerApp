package com.example.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    TextView tvTitle, tvSott;
    Button btnBai1, btnBai2, btnBai3, btnBai4, btnBai5, btnBai6, btnChon;
    List<Song> list;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        AnhXA();
        AddSong();
    }

    public void AnhXA() {
        tvTitle = findViewById(R.id.tvtitle);
        tvSott = findViewById(R.id.tvSottbai);
        btnBai1 = findViewById(R.id.btnBai1);
        btnBai2 = findViewById(R.id.btnBai2);
        btnBai3 = findViewById(R.id.btnBai3);
        btnBai4 = findViewById(R.id.btnBai4);
        btnBai5 = findViewById(R.id.btnBai5);
        btnBai6 = findViewById(R.id.btnBai6);
        btnChon = findViewById(R.id.btnChon);
        btnBai1.setOnClickListener(this);
        btnBai2.setOnClickListener(this);
        btnBai3.setOnClickListener(this);
        btnBai4.setOnClickListener(this);
        btnBai5.setOnClickListener(this);
        btnBai6.setOnClickListener(this);
        btnChon.setOnClickListener(this);
    }

    public void AddSong() {
        list = new ArrayList<>();
        list.add(new Song("Anh Đâu Thấy", R.raw.anhdauthaylemesegraykee, 1));
        list.add(new Song("Between", R.raw.betweenuslittlemix, 2));
        list.add(new Song("Nhìm trộm", R.raw.nhintromphungdemac, 3));
        list.add(new Song("Umso", R.raw.umso, 4));
        list.add(new Song("Rơi Vào", R.raw.roivaoycachtaithinhnhamtamnhi, 5));
        list.add(new Song("Thiếu niên", R.raw.thieunienmongnhien, 6));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBai1:
                position = 0;
                tvSott.setText("1");
                break;
            case R.id.btnBai2:
                position = 1;
                tvSott.setText("2");
                break;
            case R.id.btnBai3:
                position = 2;
                tvSott.setText("3");
                break;
            case R.id.btnBai4:
                position = 3;
                tvSott.setText("4");
                break;
            case R.id.btnBai5:
                position = 4;
                tvSott.setText("5");
                break;
            case R.id.btnBai6:
                position = 5;
                tvSott.setText("6");
                break;
            case R.id.btnChon:
                Intent intent = new Intent(this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("song", list.get(position));
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
                break;
        }
    }
}
