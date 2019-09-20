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
    private int sIDc;
    private int sIDd;
    private int sIDe;
    private int sIDf;
    private int sIDg;
    private int sIDa;
    private int sIDb;

    private Button c;
    private Button d;
    private Button e;
    private Button f;
    private Button g;
    private Button a;
    private Button b;

    private boolean isSoundPoolLoaded;
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
        c.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDc, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        d.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDd, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        e.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDe, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        f.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDf, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        g.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDg, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
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
                    soundPool.play(sIDa, volume, volume, 1, 0, 1f);
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
                    soundPool.play(sIDb, volume, volume, 1, 0, 1f);
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
        sIDc = soundPool.load(this, R.raw.scalec, 1);
        sIDd = soundPool.load(this, R.raw.scaled, 1);
        sIDe = soundPool.load(this, R.raw.scalee, 1);
        sIDf = soundPool.load(this, R.raw.scalef, 1);
        sIDg = soundPool.load(this, R.raw.scaleg, 1);
        sIDa = soundPool.load(this, R.raw.scalea, 1);
        sIDb = soundPool.load(this, R.raw.scaleb, 1);
    }

    private void wireWidgets() {
        c = findViewById(R.id.button_main_C);
        d = findViewById(R.id.button_Main_D);
        e = findViewById(R.id.button_main_E);
        f = findViewById(R.id.button_main_F);
        g = findViewById(R.id.button_main_G);
        a = findViewById(R.id.button_main_A);
        b = findViewById(R.id.button_main_B);

    }


}