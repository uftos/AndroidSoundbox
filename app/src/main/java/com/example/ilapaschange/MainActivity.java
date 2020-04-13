package com.example.ilapaschange;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.media.AudioManager;
import android.media.AudioAttributes;
import android.os.Build;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    private int ah, evangelion, liquido, aioaio, dejavu, grandmere, manuchao, non, philippe, femme, mere, pere, lalala, yamete, omaewa, nani, danslanuitnoire, itadakimasu, sodesune, cgt, heure, duu, tuturu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(1)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }
        ah = soundPool.load(this, R.raw.ah, 1);
        evangelion = soundPool.load(this, R.raw.evangelion, 1);
        aioaio = soundPool.load(this, R.raw.aioaioaoi, 1);
        dejavu = soundPool.load(this, R.raw.dejavu, 1);
        grandmere = soundPool.load(this, R.raw.grandmere, 1);
        liquido = soundPool.load(this, R.raw.liquido, 1);
        manuchao = soundPool.load(this, R.raw.manuchao, 1);
        non = soundPool.load(this, R.raw.non, 1);
        philippe = soundPool.load(this, R.raw.philippe, 1);
        femme = soundPool.load(this, R.raw.tafemme, 1);
        mere = soundPool.load(this, R.raw.tamere, 1);
        pere = soundPool.load(this, R.raw.tonpere, 1);
        lalala = soundPool.load(this, R.raw.lalala, 1);
        yamete = soundPool.load(this, R.raw.yametekudasai, 1);
        omaewa = soundPool.load(this, R.raw.omaewamoushindeiru, 1);
        nani = soundPool.load(this, R.raw.nani, 1);
        danslanuitnoire = soundPool.load(this, R.raw.danlanuitnoire, 1);
        itadakimasu = soundPool.load(this, R.raw.itadakimasu, 1);
        sodesune = soundPool.load(this, R.raw.soudesune, 1);
        cgt = soundPool.load(this, R.raw.cgt, 1);
        heure = soundPool.load(this, R.raw.heures, 1);
        duu = soundPool.load(this, R.raw.duu, 1);
        tuturu = soundPool.load(this, R.raw.tuturu, 1);

    }

    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button_ah:
                soundPool.play(ah, 1, 1, 0, 0, 1);
                break;
            case R.id.button_aioaioaio:
                soundPool.play(aioaio, 1, 1, 0, 0, 1);
                break;
            case R.id.button_dejavu:
                soundPool.play(dejavu, 1, 1, 0, 0, 1);
                break;
            case R.id.button_evangelion:
                soundPool.play(evangelion, 1, 1, 0, 0, 1);
                break;
            case R.id.button_femme:
                soundPool.play(femme, 1, 1, 0, 0, 1);
                break;
            case R.id.button_grandmere:
                soundPool.play(grandmere, 1, 1, 0, 0, 1);
                break;
            case R.id.button_liquido:
                soundPool.play(liquido, 1, 1, 0, 0, 1);
                break;
            case R.id.button_manuchao:
                soundPool.play(manuchao, 1, 1, 0, 0, 1);
                break;
            case R.id.button_mere:
                soundPool.play(mere, 1, 1, 0, 0, 1);
                break;
            case R.id.button_non:
                soundPool.play(non, 1, 1, 0, 0, 1);
                break;
            case R.id.button_philippe:
                soundPool.play(philippe, 1, 1, 0, 0, 1);
                break;
            case R.id.button_père:
                soundPool.play(pere, 1, 1, 0, 0, 1);
                break;
            case R.id.button_lalala:
                soundPool.play(lalala, 1, 1, 0, 0, 1);
                break;
            case R.id.button_yamete:
                soundPool.play(yamete, 1, 1, 0, 0, 1);
                break;
            case R.id.button_omae:
                soundPool.play(omaewa, 1, 1, 0, 0, 1);
                break;
            case R.id.button_nani:
                soundPool.play(nani, 1, 1, 0, 0, 1);
                break;
            case R.id.button_danslanuitnoire:
                soundPool.play(danslanuitnoire, 1, 1, 0, 0, 1);
                break;
            case R.id.button_itadakimasu:
                soundPool.play(itadakimasu, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sodesune:
                soundPool.play(sodesune, 1, 1, 0, 0, 1);
                break;
            case R.id.button_cgt:
                soundPool.play(cgt, 1, 1, 0, 0, 1);
                break;
            case R.id.button_heure:
                soundPool.play(heure, 1, 1, 0, 0, 1);
                break;
            case R.id.button_duu:
                soundPool.play(duu, 1, 1, 0, 0, 1);
                break;
            case R.id.button_tuturu:
                soundPool.play(tuturu, 1, 1, 0, 0, 1);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }
}
