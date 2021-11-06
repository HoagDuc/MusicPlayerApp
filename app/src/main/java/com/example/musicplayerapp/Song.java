package com.example.musicplayerapp;

import java.io.Serializable;

public class Song implements Serializable {
    String title;
    int file;
    int Sobai;

    public Song(String title, int file, int sobai) {
        this.title = title;
        this.file = file;
        Sobai = sobai;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public int getSobai() {
        return Sobai;
    }

    public void setSobai(int sobai) {
        Sobai = sobai;
    }

}
