package com.example.android.myguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TourItemActivity extends AppCompatActivity {

    private String uri;

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
            disp.setText(R.string.lingraj);
            disp1.setText(R.string.lingaraj1);
            disp2.setText(R.string.lingraj2);
            disp3.setText(R.string.lingraj3);
            rating.setImageResource(R.drawable.rating3);
            uri = "https://en.wikipedia.org/wiki/Lingaraja_Temple";
        }
        else if(InfoWord.mPosition==1){
            disp.setText(R.string.udaygiri);
            disp1.setText(R.string.udaygiri1);
            disp2.setText(R.string.udaygiri2);
            disp3.setText(R.string.udaygiri3);
            rating.setImageResource(R.drawable.rating3);
            uri = "https://en.wikipedia.org/wiki/Udayagiri_and_Khandagiri_Caves";

        }
        else if(InfoWord.mPosition==2)
        {
            disp.setText(R.string.Ram_Mandir);
            disp1.setText(R.string.Ram_Mandir1);
            disp2.setText(R.string.Ram_Mandir2);
            disp3.setText(R.string.Ram_Mandir3);
            rating.setImageResource(R.drawable.rating3);
            uri = "https://en.wikipedia.org/wiki/Ram_Mandir,_Bhubaneswar";
        }
        else if(InfoWord.mPosition==3)
        {
            disp.setText(R.string.Mukteshwar_Temple);
            disp1.setText(R.string.Mukteshwar_Temple1);
            disp2.setText(R.string.Mukteshwar_Temple2);
            disp3.setText(R.string.Mukteshwar_Temple3);
            rating.setImageResource(R.drawable.rating3);
            uri = "https://odishatourism.gov.in/content/tourism/en/discover/attractions/temples-monuments/mukteswar-temple.html";
        }
        else if(InfoWord.mPosition==4)
        {
            disp.setText(R.string.museum);
            disp1.setText(R.string.museum1);
            disp2.setText(R.string.museum2);
            disp3.setText(R.string.museum3);
            rating.setImageResource(R.drawable.rating3);
            uri = "https://www.tourmyindia.com/states/odisha/state-museum.html";
        }
        else if(InfoWord.mPosition==5)
        {
            disp.setText(R.string.Ram_Mandir);
            disp1.setText(R.string.Ram_Mandir1);
            disp2.setText(R.string.Ram_Mandir2);
            disp3.setText(R.string.Ram_Mandir3);
            rating.setImageResource(R.drawable.rating3);
            uri = "https://en.wikipedia.org/wiki/Ram_Mandir,_Bhubaneswar";
        }
        else if(InfoWord.mPosition==6)
        {
            disp.setText(R.string.Ram_Mandir);
            disp1.setText(R.string.Ram_Mandir1);
            disp2.setText(R.string.Ram_Mandir2);
            disp3.setText(R.string.Ram_Mandir3);
            rating.setImageResource(R.drawable.rating3);
            uri = "https://en.wikipedia.org/wiki/Ram_Mandir,_Bhubaneswar";
        }
        else if(InfoWord.mPosition==7)
        {
            disp.setText(R.string.Ram_Mandir);
            disp1.setText(R.string.Ram_Mandir1);
            disp2.setText(R.string.Ram_Mandir2);
            disp3.setText(R.string.Ram_Mandir3);
            rating.setImageResource(R.drawable.rating3);
            uri = "https://en.wikipedia.org/wiki/Ram_Mandir,_Bhubaneswar";
        }
        else if(InfoWord.mPosition==8)
        {
            disp.setText(R.string.Ram_Mandir);
            disp1.setText(R.string.Ram_Mandir1);
            disp2.setText(R.string.Ram_Mandir2);
            disp3.setText(R.string.Ram_Mandir3);
            rating.setImageResource(R.drawable.rating3);
            uri = "https://en.wikipedia.org/wiki/Ram_Mandir,_Bhubaneswar";
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