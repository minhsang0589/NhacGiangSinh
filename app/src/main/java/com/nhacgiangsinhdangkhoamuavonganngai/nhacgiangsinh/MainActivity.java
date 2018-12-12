package com.nhacgiangsinhdangkhoamuavonganngai.nhacgiangsinh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Annotation;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout manhinh;
    ImageView imageView;
    MediaPlayer song;
    Animation f;



    public void anhxa(){
        manhinh=(RelativeLayout)findViewById(R.id.manhinh);
        imageView=(ImageView)findViewById(R.id.imv);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        manhinh.setBackgroundResource(R.mipmap.hinhnen12);
        song=MediaPlayer.create(getApplicationContext(),R.raw.nuademkhanhuatuanvutamlhuonganh);
        song.start();
        f = AnimationUtils.loadAnimation(this,R.anim.fadee);
        f.reset();
        imageView.clearAnimation();
        imageView.startAnimation(f);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.stop();
                Intent intent=new Intent(MainActivity.this,Music.class);
                startActivity(intent);
                finish();



            }
        });



    }

}
