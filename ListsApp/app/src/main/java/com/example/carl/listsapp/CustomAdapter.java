package com.example.carl.listsapp;

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
 * Created by Carl on 07/11/2016.
 */

public class CustomAdapter extends ArrayAdapter<Icon> {

    private static class ViewHolder
    {
        ImageView imageView;
        TextView textView;
    }

    public CustomAdapter(Context context, ArrayList<Icon> icons)
    {
        super(context, R.layout.item_custom_row, icons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Icon icon = getItem(position); // return current element from array of types

        ViewHolder viewHolder;

        if(convertView == null)
        {
            viewHolder = new ViewHolder();

            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            convertView = layoutInflater.inflate(R.layout.item_custom_row, parent, false);

            viewHolder.imageView = (ImageView)convertView.findViewById(R.id.image);
            viewHolder.textView = (TextView)convertView.findViewById(R.id.text);

            convertView.setTag(icon);
        }
        else
        {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.textView.setText(icon.getDescription());
        viewHolder.imageView.setImageResource(icon.getImage());

        return convertView;
    }
}
