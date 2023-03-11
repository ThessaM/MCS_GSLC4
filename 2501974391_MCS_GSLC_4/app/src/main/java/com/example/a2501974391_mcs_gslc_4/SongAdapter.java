package com.example.a2501974391_mcs_gslc_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    Context ctx;
    Vector<Song> songs;

    public SongAdapter(Context ctx) {
        this.ctx = ctx;
    }

    public void setSongs(Vector<Song> songs) {
        this.songs = songs;
    }

    @NonNull
    @Override
    public SongAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.song_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.ViewHolder holder, int position) {
        holder.songAttr.setText(songs.get(position).getSongArtist() + " - " + songs.get(position).getSongName());
        holder.songLength.setText(String.valueOf(songs.get(position).getSongLength()));
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView songAttr, songLength;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            songAttr = itemView.findViewById(R.id.textView_Item_SongAttr);
            songLength = itemView.findViewById(R.id.textView_Item_SongLength);
        }
    }
}
