package com.example.a2501974391_mcs_gslc_4;

public class Song {
    private String songName;
    private String songArtist;
    private String songLength;

    public Song(String songName, String songArtist, String songLength) {
        this.songName = songName;
        this.songArtist = songArtist;
        this.songLength = songLength;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public String getSongLength() {
        return songLength;
    }

    public void setSongLength(String songLength) {
        this.songLength = songLength;
    }
}
