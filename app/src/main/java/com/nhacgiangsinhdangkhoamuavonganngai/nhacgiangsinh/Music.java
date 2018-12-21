package com.nhacgiangsinhdangkhoamuavonganngai.nhacgiangsinh;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

public class  Music extends AppCompatActivity implements BaihatAdapter.OnItemClicked {

    TextView tvloinhan;
    RecyclerView Rcvbaihat;
    LinearLayout manhinh;
    MediaPlayer song;
    ArrayList<Baihat> dsbaihat;

    int i;
    ImageView imvdk;
    Animation f;
    BaihatAdapter baihatAdapter;

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


         baihatAdapter = new BaihatAdapter(Music.this,dsbaihat);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        Rcvbaihat.setHasFixedSize(true);
        Rcvbaihat.setLayoutManager(layoutManager);
        Rcvbaihat.setAdapter(baihatAdapter);

        imvdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.stop();
                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent1);
            }
        });
    }
    public void anhxa() {
        tvloinhan = (TextView) findViewById(R.id.tv1);
        Rcvbaihat = (RecyclerView) findViewById(R.id.Rcvdanhsach);
        manhinh = (LinearLayout) findViewById(R.id.manhinh2);
        imvdk = (ImageView) findViewById(R.id.imvdk);
    }

    public void TaoAnimation() {
        Animation Zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        Zoom.reset();
        tvloinhan.clearAnimation();
        tvloinhan.startAnimation(Zoom);
    }

    @Override
    public void onItemClick(int i) {
        song.stop();
        song = MediaPlayer.create(getApplicationContext(), dsbaihat.get(i).getNhac());
        song.start();
        tvloinhan.setText(dsbaihat.get(i).getLoinhan());
        TaoAnimation();

    }
    public void taomangbaihat(){
        dsbaihat =new ArrayList<Baihat>();
        dsbaihat.add(new Baihat("Nữa đêm khấn hứa - Tuấn vũ","Nữa đêm khấn hứa - Tuấn vũ",R.raw.nuademkhanhuatuanvutamlhuonganh));
        dsbaihat.add(new Baihat("oh my lord","oh my lord",R.raw.ohmylord));
        dsbaihat.add(new Baihat("Last christ mas","Last christ mas",R.raw.lastchristmas));
        dsbaihat.add(new Baihat("jinglebells","jinglebells",R.raw.inglebells));
        dsbaihat.add(new Baihat("We wish you a merry christmas","We wish you a merry christmas",R.raw.wewishyouamerrychristmas));
        dsbaihat.add(new Baihat("Tình người ngoại đạo - Băng Tâm","Tình người ngoại đạo - Băng Tâm",R.raw.tinhnguoingoaidaobangtam));
        dsbaihat.add(new Baihat("Đêm thánh vô cùng _ Evis Phương","Đêm thánh vô cùng _ Evis Phương",R.raw.nuademkhanhuatuanvutamlhuonganh));
        dsbaihat.add(new Baihat("Hai mùa giáng sinh","Hai mùa giáng sinh",R.raw.haimuagiangsinhnhuquynh));
        dsbaihat.add(new Baihat("Dư Âm Mùa Giáng Sinh - Minh Tuyết","Dư Âm Mùa Giáng Sinh - Minh Tuyết",R.raw.duammuagiangsinhminhtuyet));
        dsbaihat.add(new Baihat("Đêm Kỷ Niệm - TháiChâu NhưQuỳnh","Đêm Kỷ Niệm - TháiChâu NhưQuỳnh",R.raw.demkyniemthaichaunhuquynh));
        dsbaihat.add(new Baihat("Mùa đông năm ấy- Khắc Triệu","Mùa đông năm ấy- Khắc Triệu",R.raw.muadongnamaykhactrieu));
        dsbaihat.add(new Baihat("Mừng Chúa ra đời","Mừng Chúa ra đời",R.raw.mungchuaradoi));

    }
    }






