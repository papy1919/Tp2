public class Song {

    protected String title;
    protected float duration;
    protected String genre;

    public Song(String title, float duration, String genre){
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public void playSong(){
        System.out.println("Playing the song: " + title);
    }

    public float getDuration(){
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void showSong() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration);
        System.out.println("*********************************************");
    }
}

