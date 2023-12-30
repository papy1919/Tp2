import java.lang.reflect.Array;
import java.util.ArrayList;

class Artist {
    protected ArrayList<Album> albums;
    protected String artistName;

    public Artist(String artistName) {
        this.albums = new ArrayList<>();
        this.artistName = artistName;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void removeAlbum(Album album) {
        if (albums.contains(album)) {
            albums.remove(album);
            System.out.println("Removed album: " + album.getAlbumTitle());
        } else {
            System.out.println("Album not found.");
        }
    }

    public void listAllSongs() {
        if (albums.isEmpty()) {
            System.out.println("No albums available!");
        } else {
            System.out.println("Albums by " + artistName + ":");
            for (Album album : albums) {
                album.listAllSongs();
            }
        }
    }
}
