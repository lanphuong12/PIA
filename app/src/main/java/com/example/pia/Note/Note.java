package com.example.pia.Note;

/**
 * Created by ST on 27/03/2017.
 */

public class Note {
    public Integer id;
    String Tile,Note;

    public Note() {
    }

    public Note(Integer id, String tile, String note) {
        this.id = id;
        Tile = tile;
        Note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTile() {
        return Tile;
    }

    public void setTile(String tile) {
        Tile = tile;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }
}
