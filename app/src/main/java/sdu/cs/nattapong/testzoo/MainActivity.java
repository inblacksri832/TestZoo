package sdu.cs.nattapong.testzoo;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img, img2, img3;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView)findViewById(R.id.imageView1);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer Music = MediaPlayer.create(MainActivity.this, R.raw.horse);
                Music.start();
            }
        });
        img2 = (ImageView)findViewById(R.id.imageView2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer Music = MediaPlayer.create(MainActivity.this, R.raw.elephant);
                Music.start();
            }
        });
        img3 = (ImageView)findViewById(R.id.imageView3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer Music = MediaPlayer.create(MainActivity.this, R.raw.lion);
                Music.start();
            }
        });
    }
    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0971917721"));
        startActivity(mobileIntent);
    }

    public void clickMap(View view) {
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.216298, 101.056642(สวนสัตว์เปิดเขาเขียว)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
//mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}


