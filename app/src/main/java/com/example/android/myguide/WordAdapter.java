package com.example.android.myguide;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    private Activity mContext;
    private String uri;

    public WordAdapter(Activity context, ArrayList<Word> words, int ColorResourceId)
    {
        super(context,0,words); // super here means we are calling the constructor of super class which ArrayAdapter in this case. Resource param can be any value here since it has no use because we
        // are inflating the Layout in getView method
        mColorResourceId = ColorResourceId;
        mContext = context;
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_layout, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);
        TextView item_nameText = (TextView)listItemView.findViewById(R.id.item_name);
        item_nameText.setText(currentWord.getItemName());

        TextView address_nameText = (TextView)listItemView.findViewById(R.id.address);
        address_nameText.setText(currentWord.getAddress());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.item_image);
        imageView.setImageResource(currentWord.getImageResource());

        RelativeLayout layout = (RelativeLayout) listItemView.findViewById(R.id.item_relativeLayout);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        layout.setBackgroundColor(color);

        Button navButton = (Button)listItemView.findViewById(R.id.item_button);
        uri = currentWord.getMapLocation();
        navButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(currentWord.getMapLocation()));
                if (intent.resolveActivity(mContext.getPackageManager()) != null) {
                    mContext.startActivity(intent);
                }
            }
        });

        ImageView infoButton = (ImageView)listItemView.findViewById(R.id.info);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InfoWord.mPosition = position;
                if(Category.activityTracker==1) {
                    Intent infIntent = new Intent(mContext, TourItemActivity.class);
                    mContext.startActivity(infIntent);
                }
                else if(Category.activityTracker==3){
                    Intent infoIntent = new Intent(mContext, InstiItemActivity.class);
                    mContext.startActivity(infoIntent);
                }


            }
        });


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;  // listItemView is returned after all the changes are done so that the ListView object defined in NumbersActivity takes
        // in the listItemView and adds it as a child view


    }
}
