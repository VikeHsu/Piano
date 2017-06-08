package com.vikehsu.piano;

import android.content.Context;
import android.media.MediaPlayer;

public class NotePlayer {
    private MediaPlayer note = null;
    private timer = new CountDownTimer(10000, 1000) {
        public void onTick(long millisUntilFinished) {
            mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
     }
        public void onFinish() {
            mTextField.setText("done!");
     }
  }

    public NotePlayer(Context context, int id){
        this.note = MediaPlayer.create(context,id);
    }

    public void onPress()
    {
        note.start();
        timer.start();
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
