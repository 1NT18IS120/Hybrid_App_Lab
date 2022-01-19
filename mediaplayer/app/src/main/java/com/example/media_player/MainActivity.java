package com.example.media_player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity<mediaPlayer> extends AppCompatActivity {
    int starttime=0;
    int stoptime=0;
    int forwardtime=5000;
    int backwardtime=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = findViewById(R.id.songname);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.alone);
        t1.setText("Alone - Marshmallow mp3");

        Button  bt1 = findViewById(R.id.play);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Playing song", Toast.LENGTH_LONG).show();
                mediaPlayer.start();
            }
        });

        Button  bt2 = findViewById(R.id.pause);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Pausing song", Toast.LENGTH_LONG).show();
                mediaPlayer.pause();
            }
        });

        Button forward=findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentpos = mediaPlayer.getCurrentPosition() ;
                if((currentpos+forwardtime) <= (stoptime =mediaPlayer.getDuration())){
                    mediaPlayer.seekTo(currentpos+forwardtime);
                }
            }
        });

        Button rewind=findViewById(R.id.rewind);
        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentpos = mediaPlayer.getCurrentPosition() ;
                if((currentpos+forwardtime) <= (stoptime =
                        mediaPlayer.getDuration())){
                    mediaPlayer.seekTo(currentpos+forwardtime);
                }
            }
        });
    }
}