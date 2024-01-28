package week13.week13_review;

import java.util.LinkedHashMap;
import java.util.Map;

public class PlayList {

    private String name;
    final private Map<String, Song> songs;

    public PlayList(String name) {
        this.name = name;
        songs = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Song> getSongs() {
        return songs;
    }

    public void addSong(Song song){
        if (song == null){
            throw new NullPointerException("Song can not be null, null can not be added to the playlist");
        }

        songs.put(song.getTitle().toLowerCase(), song);
    }

    public void removeSong(String title){

        title = title.toLowerCase();

        if (!songs.containsKey(title)){
            throw new RuntimeException("The song " + title + " not found");
        }

        songs.remove(title);
    }

    public void displayPlayList(){

        if (songs.isEmpty()){
            System.out.println("PlayList is empty");
            return;
        }

        System.out.println("PlayList: " + getName());
        for (Song song : songs.values()) {
            System.out.println("\t"+song);
        }
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "name='" + name + '\'' +
                ", Total number of songs = " + songs.size() +
                '}';
    }
}
