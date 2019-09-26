package com.example.soundboard;


public class Note {
    private int soundID;
    private int timedDelayed;

    public Note(int soundID, int timeDelayed){
        this.soundID = soundID;
        this.timedDelayed = timeDelayed;
    }

    public int getSoundID(){
        return soundID;
    }

    public int getTimedDelayed(){
        return timedDelayed;
    }

}
