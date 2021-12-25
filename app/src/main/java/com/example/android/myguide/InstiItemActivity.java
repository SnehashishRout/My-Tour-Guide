package com.example.android.myguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InstiItemActivity extends AppCompatActivity {
    private  String uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insti_item);
        TextView disp = (TextView)findViewById(R.id.title);
        TextView disp1 = (TextView)findViewById(R.id.time);
        TextView disp2 = (TextView)findViewById(R.id.entry_fee);
        TextView disp3 = (TextView)findViewById(R.id.itemText);
        ImageView rating = (ImageView)findViewById(R.id.rating);
        if(InfoWord.mPosition==0) {
            disp.setText(R.string.IIT);
            disp1.setText(R.string.IIT1);
            disp2.setText(R.string.IIT2);
            disp3.setText(R.string.IIT3);
            rating.setImageResource(R.drawable.rating4);
            uri = "https://www.iitbbs.ac.in/";
        }
        else if(InfoWord.mPosition==1){
            disp.setText(R.string.KIIT);
            disp1.setText(R.string.KIIT1);
            disp2.setText(R.string.KIIT2);
            disp3.setText(R.string.KIIT3);
            rating.setImageResource(R.drawable.rating2);
            uri = "https://kiit.ac.in/";

        }
        else if(InfoWord.mPosition==2)
        {
            disp.setText(R.string.KIMS);
            disp1.setText(R.string.KIMS1);
            disp2.setText(R.string.KIMS2);
            disp3.setText(R.string.KIMS3);
            rating.setImageResource(R.drawable.rating2);
            uri = "https://kims.kiit.ac.in/";
        }
        else if(InfoWord.mPosition==3)
        {
            disp.setText(R.string.AIIMS);
            disp1.setText(R.string.AIIMS1);
            disp2.setText(R.string.AIIMS2);
            disp3.setText(R.string.AIIMS3);
            rating.setImageResource(R.drawable.rating4);
            uri = "https://aiimsbhubaneswar.nic.in/";
        }
        else if(InfoWord.mPosition==4)
        {
            disp.setText(R.string.NISER);
            disp1.setText(R.string.NISER1);
            disp2.setText(R.string.NISER2);
            disp3.setText(R.string.NISER3);
            rating.setImageResource(R.drawable.rating4);
            uri = "https://www.niser.ac.in/";
        }
        else if(InfoWord.mPosition==5)
        {
            disp.setText(R.string.OUAT);
            disp1.setText(R.string.OUAT1);
            disp2.setText(R.string.OUAT2);
            disp3.setText(R.string.OUAT3);
            rating.setImageResource(R.drawable.rating3);
            uri = "http://www.ouat.nic.in/";
        }

        ImageView webIcon = (ImageView)findViewById(R.id.web_info);
        webIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                if(getIntent().resolveActivity(getPackageManager())!=null)
                {
                    startActivity(i);
                }
            }
        });
    }
}