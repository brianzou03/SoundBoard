package com.example.soundboard;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class SoundboardActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sID;
    private int sID2;
    private int sID3;
    private int sID4;
    private int sID5;
    private int sID6;
    private Button a;
    private Button b;
    private Button c;
    private boolean isSoundPoolLoaded;
    private int aNote;
    private int bbNote;
    private int bNote;
    boolean loaded = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);

        wireWidgets();
        initializeSound();
        setListeners();


    }

    private void setListeners() {
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                // Is the sound loaded already?
                if (isSoundPoolLoaded) {
                    soundPool.play(sID, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                // Is the sound loaded already?
                if (isSoundPoolLoaded) {
                    soundPool.play(sID, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });

    }

    private void initializeSound() {
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId,int status) {
                isSoundPoolLoaded = true;
            }
        });
        sID = soundPool.load(this, R.raw.scalec, 1);
        sID2 = soundPool.load(this, R.raw.scale, 1);
    }

    private void wireWidgets() {
        a = findViewById(R.id.button_f);
        b = findViewById(R.id.button_f);
        c = findViewById(R.id.button_f);
    }


}