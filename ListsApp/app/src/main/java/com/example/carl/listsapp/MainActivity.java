package com.example.carl.listsapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    ArrayList<Icon>icons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        icons = new ArrayList<Icon>();
        icons.add(new Icon(R.mipmap.ic_launcher, "Icon"));
        icons.add(new Icon(R.drawable.ok, "k"));

        setListAdapter(new CustomAdapter(this, icons));
        //setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names)));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        startActivity(new Intent(this, ColoursList.class));
        //Toast.makeText(this, getResources().getStringArray(R.array.names)[position], Toast.LENGTH_SHORT).show();
    }
}
