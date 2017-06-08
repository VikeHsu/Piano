package com.vikehsu.piano;

import android.content.Context;
import android.media.MediaPlayer;

public class NotePlayer {
    private MediaPlayer note = null;
    private boolean isTimeout = false;
    private boolean isPressed = false;
    private timer = new CountDownTimer(1000, 1000) {
        public void onTick(long millisUntilFinished) {
        }
        public void onFinish() {
            isTimeout = true;
            if (isPressed == false) {
                stopPlay();
            }
        }
    };

    public NotePlayer(Context context, int id){
        this.note = MediaPlayer.create(context,id);
    }

    public void onPress()
    {
        if (isTimeout == false) {
            stopPlay();
        }
        isPressed = true;
        note.start();
        timer.start();
    }
    
    public void onRelease()
    {
        isPressed = false;
        if (isTimeout == true) {
            stopPlay();
        }
    }
    
    public void stopPlay() 
    {
         if(note.isPlaying())
        {
            note.pause();
            note.seekTo(0);
        }   
    }
}
