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
    private int sIDbf;
    private int sIDcs;
    private int sIDds;
    private int sIDfs;
    private int sIDgs;

    private Button button_c;
    private Button button_d;
    private Button button_e;
    private Button button_f;
    private Button button_g;
    private Button button_a;
    private Button button_b;
    private Button button_bf;
    private Button button_cs;
    private Button button_ds;
    private Button button_fs;
    private Button button_gs;

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
        button_c.setOnClickListener(new View.OnClickListener() {
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
        button_d.setOnClickListener(new View.OnClickListener() {
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
        button_e.setOnClickListener(new View.OnClickListener() {
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
        button_f.setOnClickListener(new View.OnClickListener() {
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
        button_g.setOnClickListener(new View.OnClickListener() {
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
        button_a.setOnClickListener(new View.OnClickListener() {
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
        button_b.setOnClickListener(new View.OnClickListener() {
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
        button_bf.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDbf, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        button_cs.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDcs, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        button_ds.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDds, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        button_fs.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDfs, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        button_gs.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(sIDgs, volume, volume, 1, 0, 1f);
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
        sIDbf = soundPool.load(this, R.raw.scalebb, 1);
        sIDcs = soundPool.load(this, R.raw.scalecs, 1);
        sIDds = soundPool.load(this, R.raw.scaleds, 1);
        sIDfs = soundPool.load(this, R.raw.scalefs, 1);
        sIDgs = soundPool.load(this, R.raw.scalegs, 1);




    }

    private void wireWidgets() {
        button_c = findViewById(R.id.button_main_C);
        button_d = findViewById(R.id.button_Main_D);
        button_e = findViewById(R.id.button_main_E);
        button_f = findViewById(R.id.button_main_F);
        button_g = findViewById(R.id.button_main_G);
        button_a = findViewById(R.id.button_main_A);
        button_b = findViewById(R.id.button_main_B);
        button_bf = findViewById(R.id.button_main_bflat);
        button_cs = findViewById(R.id.button_main_csharp);
        button_ds = findViewById(R.id.button_main_dsharp);
        button_fs = findViewById(R.id.button_main_fsharp);
        button_gs = findViewById(R.id.button_main_gsharp);
    }


}