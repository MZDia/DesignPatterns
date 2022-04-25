/**
 * An extension of song that holds all the information and populates the abstract methods of a song
 * Converts a tune to a song
 * @author Mia Dia
 */
public class SongAdapter extends Song {
    public Tune tune;

    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

     /**
     * @return song title
     */
    public String getTitle() {
        String[] split = (tune.getDisplayTitle()).split(": ", 2);
        return split[0];
    }

     /**
     * @return album title
     */
    public String getAlbum() {
        String[] split = (tune.getDisplayTitle()).split(": ", 2);
        return split[1];
    }

    /**
     * @return artist's first name
     */
    public String getArtistFirstName() {
        String[] split = (tune.getArtistName()).split(" ", 2);
        return split[0];
    }

    /**
     * @return artist's last name
     */
    public String getArtistLastName() {
        String[] split = (tune.getArtistName()).split(" ", 2);
        return split[1];
    }
    
    /**
     * @return the song's genre
     */
    public String getGenre() {
        String genre = tune.getCategory().toLowerCase();
        if (genre.indexOf("country") > -1) {
            return "Country";
        }
        if (genre.indexOf("hiphop") > -1) {
            return "Hiphop";
        }
        if (genre.indexOf("jazz") > -1) {
            return "Jazz";
        }
        if (genre.indexOf("pop") > -1) {
            return "Pop";
        }
        if (genre.indexOf("rock") > -1) {
            return "Rock";
        }
        if (genre.indexOf("class") > -1) {
            return "Class";
        }
        return "Other";
    }
}
