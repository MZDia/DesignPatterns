/**
 * abstract base class that allows you to call each variable of a song and it's toString() method
 * @author Mia Dia
 */
public abstract class Song {
 
    /**
     * @return song title
     */
    public abstract String getTitle();

    /**
     * @return album title
     */
    public abstract String getAlbum();

    /**
     * @return artist's first name
     */
    public abstract String getArtistFirstName();

    /**
     * @return artist's last name
     */
    public abstract String getArtistLastName();

    /**
     * @return the song's genre
     */
    public abstract String getGenre();
    
    /**
     * @return a string strcuted "Song: song\n Album: album\n By: Name\n Genre: genre"
     */
    public String toString() {
        return "Song: " + getTitle() + "\n"
             + "Album: " + getAlbum() + "\n"
             + "By: " + getArtistFirstName() + " " + getArtistLastName() + "\n"
             + "Genre: " + getGenre();
    }
}
