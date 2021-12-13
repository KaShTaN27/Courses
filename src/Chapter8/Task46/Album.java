package Chapter8.Task46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Song findSong(String songTitle) {
        for (int i = 0; i < this.songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getTitle().equals(songTitle))
                return song;
        }
        return null;
    }

    public boolean addSong(String songTitle, double songDuration) {
        Song song = findSong(songTitle);
        if (song == null) {
            this.songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int songNumberInAlbum, LinkedList<Song> playlist) {
        if (songNumberInAlbum - 1 > this.songs.size() || songNumberInAlbum <= 0)
            return false;
        Song song = songs.get(songNumberInAlbum - 1);
        playlist.add(song);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song song = findSong(songTitle);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
}
