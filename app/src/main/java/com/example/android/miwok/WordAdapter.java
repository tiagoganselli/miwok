package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ganselli on 19/09/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, R.layout.list_item, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the Native word
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.item_image);
        if (currentWord.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(currentWord.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the Native word
        TextView nativeTextView = (TextView) listItemView.findViewById(R.id.native_word);
        // Get the Native word from the current Word object and
        // set this text on the name TextView
        nativeTextView.setText(currentWord.getNativeWord());

        // Find the TextView in the list_item.xml layout with the Foreign
        TextView foreignTextView = (TextView) listItemView.findViewById(R.id.foreign_word);
        // Get the Foreign word from the current Word object and
        // set this text on the name TextView
        foreignTextView.setText(currentWord.getForeignWord());

        // Return the whole list item layout so that it can be shown in the ListView
        return listItemView;

    }

}
