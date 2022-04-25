/**
 * Holds a Hashmap of songs to play
 * @author Mia Dia
 */
import java.util.HashMap;


 public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;

    /**
     * Creates a new jukebox
     */
    public JukeBox() {
        this.songs = new HashMap<>();
        currentSong++;
    }

    /**
     * add a song to the jukebox
     * @param song to add
     */
    public void addSong(Song song) {
        this.songs.put(song.getTitle().toLowerCase(), song);
    }

    /**
     * Plays a song in jukebox
     * @param songName - Name of the song to play
     */
    public void play(String songName) {
        Song song = songs.get(songName.toLowerCase());
        System.out.println(song.toString() + "\n");
    }
}