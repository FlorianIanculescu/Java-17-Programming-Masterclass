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
    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }
    public boolean addToPlayList(int track, LinkedList playList) {
        Song song = songs.findSong(track);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList playList) {
        Song song = songs.findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;
        private SongList() {
            songs = new ArrayList<>();
        }
        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }
        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }
        private Song findSong(int track) {
            if (track >= 1 && track <= songs.size()) return songs.get(track - 1);
            return null;
        }
    }
}