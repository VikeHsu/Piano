package com.vikehsu.piano;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private PianoKey KEY_1;
    private PianoKey KEY_2;
    private PianoKey KEY_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setImmersiveMode();

        KEY_1 = (PianoKey)findViewById(R.id.key1);
        KEY_2 = (PianoKey)findViewById(R.id.key2);
        KEY_3 = (PianoKey)findViewById(R.id.key3);

        KEY_1.init("C",R.raw.piano_ff_c3_01);
        KEY_2.init("D",R.raw.piano_ff_d3_01);
        KEY_3.init("E",R.raw.piano_ff_e3_01);
    }

    private void setImmersiveMode(){
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }
}
