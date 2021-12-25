package com.example.android.myguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Institute extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("IIT BBSR","Old Town",R.mipmap.iit,"geo:20.29684652030747,85.82263694974397"));
        words.add(new Word("KIIT","Patia",R.mipmap.kiit,"geo:20.355654880110546,85.81552813439875"));
        words.add(new Word("KIMS","Patia",R.mipmap.kiims,"geo:20.35429925195771,85.81561141905352"));
        words.add(new Word("AIIMS","Patrapada",R.drawable.aiims,"geo:20.231733515369964, 85.77515640382128"));
        words.add(new Word("NISER","Jatni",R.drawable.niser,"geo:20.171414415392146, 85.68369808836309"));
        words.add(new Word("OUAT","Unit 8",R.drawable.ouat,"geo:20.26530864965287, 85.81163096619554"));
        words.add(new Word("ICT","Gajapati Nagar",R.drawable.ict,"geo:20.35429925195771,85.81561141905352"));
        words.add(new Word("XIMB","Jaydev Bihar",R.drawable.ximb,"geo:20.30847241977505, 85.81887611774845"));
        words.add(new Word("IOPB","Sachivalay Marg,Gajapati Nagar",R.drawable.iip,"geo:20.30873243935238, 85.83167566168517"));

        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.light_Yellow);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(wordAdapter);

    }
}