package com.example.a2501974391_mcs_gslc_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Vector;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    ImageButton logoutBtn;
    RecyclerView songRecycler;
    Vector<Song> songs;
    SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        logoutBtn = findViewById(R.id.button_Home_Logout);
        logoutBtn.setOnClickListener(this);

        songs = new Vector<>();
        songs.add(new Song("Snap", "Rosa Linn", "3.05"));
        songs.add(new Song("Takkan Kemana", "TheOvertunes", "3.58"));
        songs.add(new Song("Rock With You", "Seventeen", "3.06"));
        songs.add(new Song("Dry Flower", "Yuuri", "4.48"));
        songs.add(new Song("Underwater", "Roa Music", "4.43"));
        songs.add(new Song("Lighthouse", "K-391", "4.00"));
        songs.add(new Song("Jalan Pulang", "Yura yunita", "3.58"));
        songs.add(new Song("Next Stop", "IU", "3.57"));
        songs.add(new Song("Lend Me Your Voice", "Belle", "5.04"));
        songs.add(new Song("Moonlight", "Roa Music", "3.57"));

        songAdapter = new SongAdapter(this);
        songAdapter.setSongs(songs);

        songRecycler = findViewById(R.id.reView_Home_SongLists);
        songRecycler.setAdapter(songAdapter);
        songRecycler.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Logout Success", Toast.LENGTH_SHORT).show();
        Intent goToLogin = new Intent(this, MainActivity.class);
        startActivity(goToLogin);
    }
}