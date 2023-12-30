
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Song songA = new Song("Rhythm of the Night", 3.45f, "Dance");
        Song songB = new Song("Stairway to Heaven", 8.02f, "Rock");
        Song songC = new Song("Take Five", 5.24f, "Jazz");

        Album albumX = new Album("Dance Party Hits");
        albumX.addSong(songA);
        albumX.addSong(songB);

        Album albumY = new Album("Rock Classics");
        albumY.addSong(songB);
        albumY.addSong(songC);

        Artist artistGroup = new Artist("Various Bands");
        artistGroup.addAlbum(albumX);
        artistGroup.addAlbum(albumY);

        System.out.println("Available Songs:");
        albumX.listAllSongs();

        albumX.removeSong(songA);

        System.out.println("the albm after removing the song");
        albumX.listAllSongs();

        System.out.println("Albums by " + artistGroup.artistName + ":");
        artistGroup.listAllSongs();

        FreeUser free = new FreeUser("poor1", "MyTunes");
        free.listen(songA);
        free.addToCustomPlaylist(songB);
        free.showCustomPlaylist();

        PremiumUser prime = new PremiumUser("Selim9", "ExclusiveMix");
        prime.listen(songC);
        prime.addToCustomPlaylist(songA);
        prime.showCustomPlaylist();
    }
}