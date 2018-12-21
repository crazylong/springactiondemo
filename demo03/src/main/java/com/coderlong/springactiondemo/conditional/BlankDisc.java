package com.coderlong.springactiondemo.conditional;

/**
 * @autor Long Qiong
 * @create 2017/11/2
 */
public class BlankDisc {
    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "BlankDisc{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + '}';
    }
}
