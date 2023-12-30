import java.util.ArrayList;

class PlayList {

    protected ArrayList<Song> songList;
    protected String title;

    public PlayList(String title) {
        this.songList = new ArrayList<>();
        this.title = title;
    }

    public void addSongToPlaylist(Song song) {
        songList.add(song);
    }

    public void removeSongFromPlaylist(Song song) {
        if (songList.contains(song)) {
            songList.remove(song);
            System.out.println("Removed song from the playlist: " + song.getTitle());
        } else {
            System.out.println("Song not found.");
        }
    }

    public void listAllSongs() {
        if (songList.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Playlist Title: " + title);
            for (Song song : songList) {
                song.showSong();
            }

        }
    }
}