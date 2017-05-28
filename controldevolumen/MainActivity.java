package com.eetsn4.nicolasarroyo.controldevolumen;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnSeekBarChangeListener{

    SeekBar sb;
    MediaPlayer mp;
    AudioManager am;
    int Volume=0;

    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        sb  =(SeekBar)findViewById(R.id.sbVolume);
        mp = MediaPlayer.create(this,R.raw.say);
        am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        mp.start();
        int maxVolume = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVolume = am.getStreamVolume(AudioManager.STREAM_MUSIC);

        sb.setMax(maxVolume);
        sb.setProgress(curVolume);

        sb.setOnSeekBarChangeListener(this);
    }

    protected void onPause(){
        super.onPause();

        mp.pause();
        //mp.release();
    }
    protected void onResume(){
        super.onResume();

        mp.start();

    }

    public void onProgressChanged(SeekBar seekb, int progress, boolean arg2) {
        am.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
        Volume = progress;
    }

    public void onStartTrackingTouch(SeekBar arg0) {


    }

    public void onStopTrackingTouch(SeekBar arg0) {

        Toast.makeText(getApplicationContext(), "Volume: " + Integer.toString(Volume), Toast.LENGTH_SHORT).show();
    }
}