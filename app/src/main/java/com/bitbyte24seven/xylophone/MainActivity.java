package com.bitbyte24seven.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // add maenber variable here
    private SoundPool mSoundpool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a sound pool
        mSoundpool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);

    }
}
