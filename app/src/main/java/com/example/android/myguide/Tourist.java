package com.example.android.myguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Tourist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Lingaraj","Old Town",R.mipmap.lingraj2,"geo:20.239013046845706,85.83428594232738"));
        words.add(new Word("Udaygiri Caves","Khandagiri",R.mipmap.udaygiri,"geo:20.2625,85.7847"));
        words.add(new Word("Ram Mandir","Saheed Nagar",R.mipmap.rama,"geo:20.27763056626541, 85.84314897918979"));
        words.add(new Word("Mukteshwar Temple","Old City",R.mipmap.mukteshwar,"geo:20.242802217444012, 85.84060631831198"));
        words.add(new Word("Odisha State Museum","Kalpana Square",R.mipmap.museum,"geo:20.256422381411035, 85.84113310000006"));
        words.add(new Word("Nandankanan Zoo","Nanankanan Road",R.mipmap.nandankanan,"geo:20.39633314733583, 85.82583565396357"));
        words.add(new Word("Pathani-Samanta Planetarium","Acharya Vihar",R.mipmap.planetarium,"geo:20.298187406754565, 85.83224994660857"));
        words.add(new Word("Rajrani Temple","Kedar Gouri Vihar",R.mipmap.rajrani_temple,"geo:20.24358553872855, 85.84349844749742"));
        words.add(new Word("ISKCON Temple","Nayapalli",R.mipmap.iscon,"geo:20.28911752511757, 85.81333408302358"));



        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.light_Green);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(wordAdapter);




    }
}