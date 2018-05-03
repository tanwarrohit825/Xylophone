package com.bitbyte24seven.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // add maenber variable here
    private SoundPool mSoundpool;

    //Add maenber variable
    private int mCSoundID;
    private int mDSoundID;
    private int mESoundID;
    private int mFSoundID;
    private int mGSoundID;
    private int mASoundID;
    private int mBSoundID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a sound pool
        mSoundpool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);


        //Load the sound ID
        mCSoundID = mSoundpool.load(this,R.raw.note1_c,1);
        mDSoundID = mSoundpool.load(this,R.raw.note2_d,1);
        mESoundID = mSoundpool.load(this,R.raw.note3_e,1);
        mFSoundID = mSoundpool.load(this,R.raw.note4_f,1);
        mGSoundID = mSoundpool.load(this,R.raw.note5_g,1);
        mASoundID = mSoundpool.load(this,R.raw.note6_a,1);
        mBSoundID = mSoundpool.load(this,R.raw.note7_b,1);


    }

    //add onclick method
    public void playC(View view) {
        Log.d("working","workin");
        mSoundpool.play(mCSoundID,1.0f,1.0f,0,0,2.0f);


    }

    public void playD(View view) {
        mSoundpool.play(mDSoundID,1.0f,1.0f,0,0,2.0f);
    }

    public void playE(View view) {
        mSoundpool.play(mESoundID,1.0f,1.0f,0,0,2.0f);
    }

    public void playF(View view) {
        mSoundpool.play(mFSoundID,1.0f,1.0f,0,0,2.0f);
    }

    public void playG(View view) {
        mSoundpool.play(mASoundID,1.0f,1.0f,0,0,2.0f);
    }
    public void playA(View view) {
        mSoundpool.play(mASoundID,1.0f,1.0f,0,0,2.0f);
    }

    public void playB(View view) {
        mSoundpool.play(mBSoundID,1.0f,1.0f,0,0,2.0f);
    }


}
