package com.nhacgiangsinhdangkhoamuavonganngai.nhacgiangsinh;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Music extends AppCompatActivity {

    TextView tvloinhan;
    ListView lvbaihat;//
    LinearLayout manhinh;
    MediaPlayer song;
    ArrayList<Baihat> dsbaihat;//
//    ArrayList<String> mangtenbaihat;
//    ArrayList<String> mangloinhan;
//    ArrayList<Integer> mangmp3;
    int i;
    ImageView imvdk;
    Animation f;
    BaihatAdapter baihatAdapter;



    public void anhxa() {
        tvloinhan = (TextView) findViewById(R.id.tv1);
        lvbaihat = (ListView) findViewById(R.id.lvdanhsach);
        manhinh = (LinearLayout) findViewById(R.id.manhinh2);
        imvdk = (ImageView) findViewById(R.id.imvdk);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        anhxa();
        manhinh.setBackgroundResource(R.mipmap.hinhnen22);

        song = MediaPlayer.create(getApplicationContext(), R.raw.nhacnen);
        song.start();
        f = AnimationUtils.loadAnimation(this,R.anim.fadee);
        f.reset();
        imvdk.clearAnimation();
        imvdk.startAnimation(f);


        tvloinhan.setText("Chúc Mừng Giáng Sinh \n");
        TaoAnimation();

//        taomang();
        taomangbaihat();


         baihatAdapter = new BaihatAdapter(Music.this, R.layout.dongbaihat, dsbaihat);
        lvbaihat.setAdapter(baihatAdapter);



        lvbaihat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                song.stop();
                song = MediaPlayer.create(getApplicationContext(), dsbaihat.get(position).getNhac());
                song.start();
                tvloinhan.setText(dsbaihat.get(position).getLoinhan());
                TaoAnimation();


            }
        });
        imvdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.stop();
                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent1);
            }
        });
    }

    public void TaoAnimation() {
        Animation Zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        Zoom.reset();
        tvloinhan.clearAnimation();
        tvloinhan.startAnimation(Zoom);
    }

//    public void taomang() {
//        mangtenbaihat = new ArrayList<String>();
//        mangloinhan = new ArrayList<String>();
//        mangmp3 = new ArrayList<Integer>();
//
//        mangmp3.add(R.raw.nuademkhanhuatuanvutamlhuonganh);
//        mangtenbaihat.add("Nữa đêm khấn hứa - Tuấn vũ");
//        mangloinhan.add("Nữa đêm khấn hứa - Tuấn vũ");
//
//        mangmp3.add(R.raw.ohmylord);
//        mangtenbaihat.add("oh my lord");
//        mangloinhan.add("oh my lord");
//
//        mangmp3.add(R.raw.lastchristmas);
//        mangtenbaihat.add("Last christ mas");
//        mangloinhan.add("Last christ mas");
//
//        mangmp3.add(R.raw.inglebells);
//        mangtenbaihat.add("jinglebells");
//        mangloinhan.add("jinglebells");
//
//        mangmp3.add(R.raw.silentnight);
//        mangtenbaihat.add("Silentnight");
//        mangloinhan.add("Silentnight");
//
//        mangmp3.add(R.raw.wewishyouamerrychristmas);
//        mangtenbaihat.add("We wish you a merry christmas");
//        mangloinhan.add("We wish you a merry christmas");
//
//        mangmp3.add(R.raw.tinhnguoingoaidaobangtam);
//        mangtenbaihat.add("Tình người ngoại đạo - Băng Tâm");
//        mangloinhan.add("Tình người ngoại đạo - Băng Tâm");
//
//        mangmp3.add(R.raw.demthanhvocungevisphuong);
//        mangtenbaihat.add("Đêm thánh vô cùng _ Evis Phương");
//        mangloinhan.add("Đêm thánh vô cùng _ Evis Phương");
//
//        mangmp3.add(R.raw.duammuagiangsinhminhtuyet);
//        mangtenbaihat.add("Dư Âm Mùa Giáng Sinh - Minh Tuyết");
//        mangloinhan.add("Dư Âm Mùa Giáng Sinh - Minh Tuyết");
//
//        mangmp3.add(R.raw.demkyniemthaichaunhuquynh);
//        mangtenbaihat.add("Đêm Kỷ Niệm - TháiChâu NhưQuỳnh");
//        mangloinhan.add("Đêm Kỷ Niệm - TháiChâu NhưQuỳnh");
//
//
//
//
//    }
    public void taomangbaihat(){
        dsbaihat =new ArrayList<Baihat>();
        dsbaihat.add(new Baihat("Nữa đêm khấn hứa - Tuấn vũ","Nữa đêm khấn hứa - Tuấn vũ",R.raw.nuademkhanhuatuanvutamlhuonganh));


        dsbaihat.add(new Baihat("oh my lord","oh my lord",R.raw.ohmylord));



        dsbaihat.add(new Baihat("Last christ mas","Last christ mas",R.raw.lastchristmas));

        dsbaihat.add(new Baihat("jinglebells","jinglebells",R.raw.inglebells));


        dsbaihat.add(new Baihat("We wish you a merry christmas","We wish you a merry christmas",R.raw.wewishyouamerrychristmas));

        dsbaihat.add(new Baihat("Tình người ngoại đạo - Băng Tâm","Tình người ngoại đạo - Băng Tâm",R.raw.tinhnguoingoaidaobangtam));



        dsbaihat.add(new Baihat("Đêm thánh vô cùng _ Evis Phương","Đêm thánh vô cùng _ Evis Phương",R.raw.nuademkhanhuatuanvutamlhuonganh));

        dsbaihat.add(new Baihat("Nữa đêm khấn hứa - Tuấn vũ","Nữa đêm khấn hứa - Tuấn vũ",R.raw.demthanhvocungevisphuong));



        dsbaihat.add(new Baihat("Dư Âm Mùa Giáng Sinh - Minh Tuyết","Dư Âm Mùa Giáng Sinh - Minh Tuyết",R.raw.duammuagiangsinhminhtuyet));


        dsbaihat.add(new Baihat("Đêm Kỷ Niệm - TháiChâu NhưQuỳnh","Đêm Kỷ Niệm - TháiChâu NhưQuỳnh",R.raw.demkyniemthaichaunhuquynh));
        dsbaihat.add(new Baihat("Nữa đêm khấn hứa - Tuấn vũ","Nữa đêm khấn hứa - Tuấn vũ",R.raw.nuademkhanhuatuanvutamlhuonganh));


        dsbaihat.add(new Baihat("oh my lord","oh my lord",R.raw.ohmylord));



        dsbaihat.add(new Baihat("Last christ mas","Last christ mas",R.raw.lastchristmas));

        dsbaihat.add(new Baihat("jinglebells","jinglebells",R.raw.inglebells));


        dsbaihat.add(new Baihat("We wish you a merry christmas","We wish you a merry christmas",R.raw.wewishyouamerrychristmas));

        dsbaihat.add(new Baihat("Tình người ngoại đạo - Băng Tâm","Tình người ngoại đạo - Băng Tâm",R.raw.tinhnguoingoaidaobangtam));



        dsbaihat.add(new Baihat("Đêm thánh vô cùng _ Evis Phương","Đêm thánh vô cùng _ Evis Phương",R.raw.nuademkhanhuatuanvutamlhuonganh));

        dsbaihat.add(new Baihat("Nữa đêm khấn hứa - Tuấn vũ","Nữa đêm khấn hứa - Tuấn vũ",R.raw.demthanhvocungevisphuong));



        dsbaihat.add(new Baihat("Dư Âm Mùa Giáng Sinh - Minh Tuyết","Dư Âm Mùa Giáng Sinh - Minh Tuyết",R.raw.duammuagiangsinhminhtuyet));


        dsbaihat.add(new Baihat("Đêm Kỷ Niệm - TháiChâu NhưQuỳnh","Đêm Kỷ Niệm - TháiChâu NhưQuỳnh",R.raw.demkyniemthaichaunhuquynh));
    }

    }






