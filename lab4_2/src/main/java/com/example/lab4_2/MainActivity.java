package com.example.lab4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


import name.ank.lab4.BibDatabase;
import name.ank.lab4.BibEntry;
import name.ank.lab4.Keys;

import static java.lang.System.out;


public class MainActivity extends AppCompatActivity {

    private MyAdapter bibAdapter;
    private BibDatabase database;

    private ArrayList<Object> bibData = new ArrayList<Object>();

        @Override
        protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            InputStream ins = getResources().openRawResource(R.raw.articles);
            //try () {
            //
           // }
            //catch (Exception ex){
            //    System.out.println("hey");
            //}
            try {
                InputStreamReader reader = new InputStreamReader(ins);
                database = new BibDatabase(reader);
            }
            catch (IOException ex){
                System.out.println("hey");
            }

        long size = database.getCfg().maxValid;
        for (int i = 0; i<size; i++) {
            BibEntry entry = database.getEntry(i);
            System.out.println(entry.getField(Keys.YEAR));
            bibData.add(
                new Object(entry.getField(Keys.AUTHOR),entry.getField(Keys.TITLE),
                        entry.getField(Keys.JOURNAL), entry.getField(Keys.YEAR),
                        entry.getField(Keys.VOLUME))
            );
        }

        bibAdapter = new MyAdapter(this, bibData);

        RecyclerView recyclerView = findViewById(R.id.my_recycler_view);
                // создаем адаптер
                // устанавливаем для списка адаптер
        recyclerView.setAdapter(bibAdapter);
        }
}