package com.example.carl.listsapp;

import android.app.ListActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Carl on 06/11/2016.
 */

public class ColoursList extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colourslist);

        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.colours)));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position)
        {
            case 0:
            {
                getWindow().getDecorView().setBackgroundColor(Color.RED);
                //Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
                break;
            }

            case 1:
            {
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                //Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();
                break;
            }

            case 2:
            {
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                //Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show();
                break;
            }

            default:
            {
                finish();
            }
        }
    }
}
