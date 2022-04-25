/**
 * "Oldie"/ older class that holds information for an older song
 * @author Mia Dia
 */
public class Oldie implements Tune {
    private String artistName, songTitle, recordTitle, category;

    /**
     * Creates an oldie
     * @param artistName artist name, space separating first and last name
     * @param songTitle title of song
     * @param recordTitle the album of the song
     * @param category the category of the song
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * returns the artist's name
     */
    public String getArtistName() {
        return this.artistName;
    }

    /**
     * returns the title like this: "title: album"
     */
    public String getDisplayTitle() {
        return this.songTitle + ": " + this.recordTitle;
    }

    /**
     * returns the category
     */
    public String getCategory() {
        return this.category;
    }
}
