package com.example.nasir.test;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mysound1;
    MediaPlayer mysound2;
    MediaPlayer mysound3;
    MediaPlayer mysound4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysound1 = MediaPlayer.create(this, R.raw.bring);
        mysound2 = MediaPlayer.create(this, R.raw.cant);
        mysound3 = MediaPlayer.create(this, R.raw.dont);
        mysound4 = MediaPlayer.create(this, R.raw.get);
    }
    public void setMysound1 (View view){
        mysound1.start();
    }
    public void setMysound2 (View view){
        mysound2.start();
    }
    public void setMysound3 (View view){
        mysound3.start();
    }
    public void setMysound4 (View view){
        mysound4.start();
    }
}
