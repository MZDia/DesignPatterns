/**
 * An extension of song that holds all the information and populates the abstract methods of a song
 * @author Mia Dia
 */
public class Track extends Song {
    private String title, album, firstName, lastName;
    private Genre genre;

    public Track (String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;

    }

     /**
     * @return song title
     */
    public String getTitle() {
        return this.title;
    }

     /**
     * @return album title
     */
    public String getAlbum() {
        return this.album;
    }

    /**
     * @return artist's first name
     */
    public String getArtistFirstName() {
        return this.firstName;
    }

    /**
     * @return artist's last name
     */
    public String getArtistLastName() {
        return this.lastName;
    }

    /**
     * @return the song's genre
     */
    public String getGenre() {
        if (genre == Genre.COUNTRY) {
            return "Country";
        }
        if (genre == Genre.HIPHOP) {
            return "Hiphop";
        }
        if (genre == Genre.JAZZ) {
            return "Jazz";
        }
        if (genre == Genre.POP) {
            return "Pop";
        }
        if (genre == Genre.ROCK) {
            return "Rock";
        }
        return "Other";
    }
}
