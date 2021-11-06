package com.example.musicplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvSoBai, tvTime, tvTen;
    Button btnChonBai, btnPlay, btnPause;
    Bundle bundle;
    Song song;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        bundle = getIntent().getExtras();
        if (bundle != null) {
            song = (Song) bundle.get("song");
        } else {
            song = new Song("Anh đâu thấy", R.raw.anhdauthaylemesegraykee, 1);
        }
        mediaPlayer = MediaPlayer.create(this, song.getFile());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        tvTime.setText(simpleDateFormat.format(mediaPlayer.getDuration()));
        tvSoBai.setText(String.valueOf(song.getSobai()));
        tvTen.setText(song.getTitle());
    }

    public void AnhXa() {
        tvSoBai = findViewById(R.id.tvSobai);
        tvTen = findViewById(R.id.tvTenBai);
        tvTime = findViewById(R.id.tvTime);
        btnChonBai = findViewById(R.id.btnChonbai);
        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);

        btnChonBai.setOnClickListener(this);
        btnPlay.setOnClickListener(this);
        btnPause.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnChonbai:
                startActivity(new Intent(this, MainActivity2.class));
                break;
            case R.id.btnPlay:
                mediaPlayer.start();
                break;
            case R.id.btnPause:
                mediaPlayer.pause();
                break;
        }
    }
}