package Chapter9.Task48;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }


    public boolean addSong(String songTitle, double songDuration) {
        return songs.add(new Song(songTitle, songDuration));
    }

    public boolean addToPlayList(int songNumberInAlbum, LinkedList<Song> playlist) {
        Song song = songs.findSong(songNumberInAlbum);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song song = songs.findSong(songTitle);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String songTitle) {
            for (int i = 0; i < this.songs.size(); i++) {
                Song song = songs.get(i);
                if (song.getTitle().equals(songTitle))
                    return song;
            }
            return null;
        }

        public  Song findSong(int songNumberInAlbum) {
            if ((songNumberInAlbum - 1 > 0) && (songNumberInAlbum - 1 < songs.size()))
                return songs.get(songNumberInAlbum - 1);
            return null;
        }
    }

}