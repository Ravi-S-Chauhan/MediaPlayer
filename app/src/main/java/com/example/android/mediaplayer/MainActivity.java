package com.example.android.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button playView = findViewById(R.id.play_view);
        playView.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "play", Toast.LENGTH_SHORT).show());
                mediaPlayer = MediaPlayer.create(this,R.raw.demons);
                mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(mp -> {
            Toast.makeText(MainActivity.this,"music is finished",Toast.LENGTH_SHORT).show();
        });

        Button pauseView = findViewById(R.id.pause_view);
        pauseView.setOnClickListener( v -> {
                Toast.makeText(MainActivity.this,"pause",Toast.LENGTH_SHORT).show();
                mediaPlayer.stop();
        });


    }
}

