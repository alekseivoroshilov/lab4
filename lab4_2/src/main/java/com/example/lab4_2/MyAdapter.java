package com.example.lab4_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import org.w3c.dom.Text;

import java.util.ArrayList;

import static java.lang.String.format;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
        private ArrayList<Object> bibData;
        private LayoutInflater inflater;
        public MyAdapter (Context context, ArrayList<Object> bibData){
            this.bibData = bibData;
            this.inflater = LayoutInflater.from(context);
        }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View view;
        TextView title, author, journal, year, volume;
        ViewHolder(View view) {
            super(view);
            this.view = view;
            title = this.view.findViewById(R.id.title_text_view);

            author = this.view.findViewById(R.id.author_text_view);
            journal = this.view.findViewById(R.id.journal_text_view);
            volume = this.view.findViewById(R.id.volume_text_view);
        }
    }

        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.title.setText(format("%s, %s", bibData.get(position).getTitle(),bibData.get(position).getYear()));
            holder.author.setText(bibData.get(position).getAuthor());
            holder.journal.setText(bibData.get(position).getJournal());
            holder.volume.setText(bibData.get(position).getVolume());
    }

        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
            View view = inflater.from(parent.getContext()).inflate(R.layout.bib, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public int getItemCount() {
            return this.bibData.size();
        }
}