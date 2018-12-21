package com.coderlong.springactiondemo.aspectparam;

import java.util.List;

/**
 * @autor Long Qiong
 * @create 2017/11/3
 */
public class BlankDisc implements CompactDisc {
    private String       title;
    private String       artist;
    private List<String> tracks;

//    public BlankDisc(String title, String artist, List<String> tracks) {
//        this.title = title;
//        this.artist = artist;
//    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

    @Override
    public void playTrack(int trackNum) {
        System.out.println("预备唱:" + tracks.get(trackNum));
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
