package ListaReproduccionSpotify;

public class ReproductorDeCanciones {
    String title;
    String artist;
    String duration;

    public ReproductorDeCanciones() {
    }

    public ReproductorDeCanciones(String title, String artist, String duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ReproductorDeCanciones{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
