package com.vikehsu.piano;

import android.content.Context;
import android.media.MediaPlayer;

public class NotePlayer {
    private MediaPlayer note = null;

    public NotePlayer(Context context, int id){
        this.note = MediaPlayer.create(context,id);
    }

    public void onPress()
    {
        note.start();
    }
    public void onRelease()
    {
        if(note.isPlaying())
        {
            note.pause();
            note.seekTo(0);
        }
    }
}