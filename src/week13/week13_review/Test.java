package week13.week13_review;

public class Test {

    public static void main(String[] args) {

        Song song1 = new Song("Enter Sandman", "Metallica", "Hard Rock", 1991);
        Song song2 = new Song("Shape of You", "Ed Sheeran", "Pop", 2017);
        Song song3 = new Song("Stairway to Heaven", "Led Zeppelin", "Rock", 1971);

        Song song4 = new Song("Hotel California", "Eagles", "Rock", 1976);
        Song song5 = new Song("Rolling in the Deep", "Adele", "Pop", 2010);
        Song song6 = new Song("Billie Jean", "Michael Jackson", "Pop", 1982);

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);

        System.out.println("-----------------------------------------------");

        PlayList playlist1 = new PlayList("Cydeo Music");

        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);

        System.out.println(playlist1);

        System.out.println(playlist1.getSongs().get("Shape of You".toLowerCase()));

        playlist1.removeSong("Shape of You");

        playlist1.displayPlayList();

        PlayList playlist2 = new PlayList("Motivation Musics");

        playlist2.addSong(song4);
        playlist2.addSong(song5);

        System.out.println(playlist2);
        playlist2.displayPlayList();

        System.out.println("-----------------------------------------------");


        MusicLibrary musicLibrary = new MusicLibrary();

        musicLibrary.addPlayList(playlist1);
        musicLibrary.addPlayList(playlist2);

        System.out.println(musicLibrary);

        musicLibrary.getPlayList("Cydeo Music").addSong(song2);

        musicLibrary.getPlayList("Motivation Musics").addSong(song6);

        //  musicLibrary.getPlayLists().get(1).getSongs().put(song6.getTitle().toLowerCase(), song6);

        musicLibrary.displayMusicLibrary();

    }
}
