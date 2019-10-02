package com.example.soundboard;

import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SoundboardActivity extends AppCompatActivity implements View.OnClickListener {
    private SoundPool soundPool;
    private int sIDc, sIDd, sIDe, sIDf, sIDg, sIDa, sIDb, sIDbf, sIDcs, sIDds, sIDfs, sIDgs;

    private Note noteC;
    private Note noteD;
    private Note noteE;
    private Note noteF;
    private Note noteG;
    private Note noteA;
    private Note noteB;
    private Note noteBF;
    private Note noteCS;
    private Note noteDS;
    private Note noteFS;
    private Note noteGS;

    private Note noteHC;
    private Note noteHD;
    private Note noteHE;
    private Note noteHF;
    private Note noteHG;
    private Note noteHA;
    private Note noteHB;
    private Note noteHBF;
    private Note noteHCS;
    private Note noteHDS;
    private Note noteHFS;
    private Note noteHGS;

    private int hsIDc;
    private int hsIDd;
    private int hsIDe;
    private int hsIDf;
    private int hsIDg;
    private int hsIDa;
    private int hsIDb;
    private int hsIDbf;
    private int hsIDcs;
    private int hsIDds;
    private int hsIDfs;
    private int hsIDgs;

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
    private Button button_scale;
    private Button song1;
    private Switch octave_changer;
    private ArrayList<Note> songNotes;
    private Map<Integer, Integer> noteMapNormalOctave;
    private Map<Integer, Integer> noteMap;
    private Map<Integer, Integer> noteMapHighOctave;
    private boolean isSoundPoolLoaded;
    private Switch note_Adder;
    private boolean adding;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);

        wireWidgets();
        initializeSound();
        initializeNotes();
        setListeners();
        initializeSongs();



    }

    private void initializeSongs(){
        ArrayList<Note> song1create = new ArrayList<>();
        song1create.add(new Note(noteHBF.getSoundID(), 454+454));
        song1create.add(new Note(noteHBF.getSoundID(), 227));
        song1create.add(new Note(noteHBF.getSoundID(), 113));
        song1create.add(new Note(noteHBF.getSoundID(), 113));
        song1create.add(new Note(noteGS.getSoundID(), 113));
        song1create.add(new Note(noteHBF.getSoundID(), 113+227));
        song1create.add(new Note(noteHBF.getSoundID(), 227));
        song1create.add(new Note(noteHBF.getSoundID(), 227+454));
        song1create.add(new Note(noteHBF.getSoundID(), 227));
        song1create.add(new Note(noteHBF.getSoundID(), 113));
        song1create.add(new Note(noteGS.getSoundID(), 113));
        song1create.add(new Note(noteHBF.getSoundID(), 113));
        song1create.add(new Note(noteHBF.getSoundID(), 227+113));
        song1create.add(new Note(noteHCS.getSoundID(), 227+454));
        song1create.add(new Note(noteHBF.getSoundID(), 454));
        song1create.add(new Note(noteGS.getSoundID(), 454));
        song1create.add(new Note(noteGS.getSoundID(), 454));
        song1create.add(new Note(noteFS.getSoundID(), 454));
        song1create.add(new Note(noteDS.getSoundID(), 227));
        song1create.add(new Note(noteDS.getSoundID(), 227));
        song1create.add(new Note(noteF.getSoundID(), 227));
        song1create.add(new Note(noteFS.getSoundID(), 227));
        song1create.add(new Note(noteDS.getSoundID(), 227));


        songNotes = song1create;
    }

    private void scale(){
        int[] scale = {sIDc, sIDd, sIDe, sIDf, sIDg, sIDa, sIDb, hsIDc};
        if (isSoundPoolLoaded){
            for(int i = 0; i < 8; i++){
                soundPool.play(scale[i], 1, 1, 1, 0, 1);
                delay(400);
            }
        }
    }





    private void setListeners() {



        KeyboardListener keyboardListener = new KeyboardListener();
        button_c.setOnClickListener(keyboardListener);

        button_d.setOnClickListener(keyboardListener);

        button_e.setOnClickListener(keyboardListener);

        button_f.setOnClickListener(keyboardListener);

        button_g.setOnClickListener(keyboardListener);

        button_a.setOnClickListener(keyboardListener);

        button_b.setOnClickListener(keyboardListener);

        button_bf.setOnClickListener(keyboardListener);

        button_cs.setOnClickListener(keyboardListener);

        button_ds.setOnClickListener(keyboardListener);

        button_fs.setOnClickListener(keyboardListener);

        button_gs.setOnClickListener(keyboardListener);

        octave_changer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true)
                {
                    noteMap = noteMapHighOctave;
                }
                else{
                    noteMap = noteMapNormalOctave;
                }
            }
        });

        button_scale.setOnClickListener(this);

        song1.setOnClickListener(this);

        note_Adder.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                adding = b;
            }
        });

    }

    private void initializeNotes(){
        noteC = new Note(sIDc, 200);
        noteD = new Note(sIDd, 200);
        noteE = new Note(sIDe, 200);
        noteF = new Note(sIDf, 200);
        noteG = new Note(sIDg, 200);
        noteA = new Note(sIDa, 200);
        noteB = new Note(sIDb, 200);
        noteBF = new Note(sIDbf, 200);
        noteCS = new Note(sIDcs, 200);
        noteDS = new Note(sIDds, 200);
        noteFS = new Note(sIDfs, 200);
        noteGS = new Note(sIDgs, 200);

        noteHC = new Note(hsIDc, 200);
        noteHD = new Note(hsIDd, 200);
        noteHE = new Note(hsIDe, 200);
        noteHF = new Note(hsIDf, 200);
        noteHG = new Note(hsIDg, 200);
        noteHA = new Note(hsIDa, 200);
        noteHB = new Note(hsIDb, 200);
        noteHBF = new Note(hsIDbf, 200);
        noteHCS = new Note(hsIDcs, 200);
        noteHDS = new Note(hsIDds, 200);
        noteHFS = new Note(hsIDfs, 200);
        noteHGS = new Note(hsIDgs, 200);


    }


    private void initializeSound() {
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        soundPool.setOnLoadCompleteListener(new OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
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

        hsIDc = soundPool.load(this, R.raw.scalehighc, 1);
        hsIDd = soundPool.load(this, R.raw.scalehighd, 1);
        hsIDe = soundPool.load(this, R.raw.scalehighe, 1);
        hsIDf = soundPool.load(this, R.raw.scalehighf, 1);
        hsIDg = soundPool.load(this, R.raw.scalehighg, 1);
        hsIDa = soundPool.load(this, R.raw.scalehigha, 1);
        hsIDb = soundPool.load(this, R.raw.scalehighb, 1);
        hsIDbf = soundPool.load(this, R.raw.scalehighbb, 1);
        hsIDcs = soundPool.load(this, R.raw.scalehighcs, 1);
        hsIDds = soundPool.load(this, R.raw.scalehighds, 1);
        hsIDfs = soundPool.load(this, R.raw.scalehighfs, 1);
        hsIDgs = soundPool.load(this, R.raw.scalehighgs, 1);


        noteMapHighOctave = new HashMap<>();
        noteMapNormalOctave = new HashMap<>();

            noteMapHighOctave.put(button_c.getId(), hsIDc);
            noteMapHighOctave.put(button_d.getId(), hsIDd);
            noteMapHighOctave.put(button_e.getId(), hsIDe);
            noteMapHighOctave.put(button_f.getId(), hsIDf);
            noteMapHighOctave.put(button_g.getId(), hsIDg);
            noteMapHighOctave.put(button_a.getId(), hsIDa);
            noteMapHighOctave.put(button_b.getId(), hsIDb);
            noteMapHighOctave.put(button_bf.getId(), hsIDbf);
            noteMapHighOctave.put(button_cs.getId(), hsIDcs);
            noteMapHighOctave.put(button_ds.getId(), hsIDds);
            noteMapHighOctave.put(button_fs.getId(), hsIDfs);
            noteMapHighOctave.put(button_gs.getId(), hsIDgs);

            noteMapNormalOctave.put(button_c.getId(), sIDc);
            noteMapNormalOctave.put(button_d.getId(), sIDd);
            noteMapNormalOctave.put(button_e.getId(), sIDe);
            noteMapNormalOctave.put(button_f.getId(), sIDf);
            noteMapNormalOctave.put(button_g.getId(), sIDg);
            noteMapNormalOctave.put(button_a.getId(), sIDa);
            noteMapNormalOctave.put(button_b.getId(), sIDb);
            noteMapNormalOctave.put(button_bf.getId(), sIDbf);
            noteMapNormalOctave.put(button_cs.getId(), sIDcs);
            noteMapNormalOctave.put(button_ds.getId(), sIDds);
            noteMapNormalOctave.put(button_fs.getId(), sIDfs);
            noteMapNormalOctave.put(button_gs.getId(), sIDgs);

            noteMap = noteMapNormalOctave;


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
        button_scale = findViewById(R.id.scale_main);
        octave_changer = findViewById(R.id.octave_changer_main);
        song1 = findViewById(R.id.song_main);
        note_Adder = findViewById(R.id.noteAdder);

    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.song_main:{
                playNote(songNotes);
                break;
            }

            case R.id.scale_main:{
                scale();
            }

        }

    }

    private class KeyboardListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            //read from map
            int songId = noteMap.get(view.getId());
            if (adding) {
                addNote(songId);
                soundPool.play(songId, 1, 1, 1, 0, 1);
            }
            else if (songId != 0) {
                soundPool.play(songId, 1, 1, 1, 0, 1);
            }

        }
    }



    public void delay(int milliDelay){
        try{
            Thread.sleep(milliDelay);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void playNote(ArrayList<Note> song) {
        for (Note note : song) {
            soundPool.play(note.getSoundID(), 1, 1, 1, 0, 1);
            delay(note.getTimedDelayed());
        }


    }
    public void addNote(int x) {
            Note noteAdded = new Note(x, 500);
            if (adding){
                songNotes.add(noteAdded);
            }

        }
}



