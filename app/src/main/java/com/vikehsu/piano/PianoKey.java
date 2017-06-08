package com.vikehsu.piano;

        import android.content.Context;
        import android.media.MediaPlayer;
        import android.support.v7.widget.AppCompatButton;
        import android.util.AttributeSet;
        import android.view.MotionEvent;
        import android.view.View;

public class PianoKey extends AppCompatButton {
    String noteName;
    NotePlayer np;

    public PianoKey(Context context) {
        super(context);
    }

    public PianoKey(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PianoKey(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init( String noteName, int id){
        this.noteName = noteName;
        this.np = new NotePlayer(this.getContext(), id);
        this.setText(noteName);

        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    np.onPress();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    np.onRelease();
                }
                return true;
            }
        });
    }

}
