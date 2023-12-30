import java.util.ArrayList;
import java.util.List;
class Album {
    protected List<Song> songs;
    protected String title;

    public Album(String title) {
        this.songs = new ArrayList<>();
        this.title = title;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        if (songs.contains(song)) {
            songs.remove(song);
            System.out.println("Removed song: " + song.getTitle());
        } else {
            System.out.println("Song not found.");
        }
    }

    public void listAllSongs() {
        if (songs.isEmpty()) {
            System.out.println("The album is empty.");
        } else {
            System.out.println("Album Title: " + title);
            for (Song song : songs) {
                song.showSong();
            }

        }
    }

        public String getAlbumTitle() {
            return title;
        }

    }

