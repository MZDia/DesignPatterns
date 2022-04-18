/**
 * The english state for Music Box and holds it's information
 * @author Mia Dia
 */
import java.util.ArrayList;

public class EnglishState implements State {
    private MusicBox box;
    
    /**
     * Creates an instant of EnglishState for the music box
     * @param MusicBox box, the object music box
     */
    public EnglishState(MusicBox box) {
        this.box = box;
    }

    /**
     * plays "Twinkle twinkle little star" in english
     */
    public void pressStarButton() {
        ArrayList<String> song = new ArrayList<>();
        song.add("Twinkle, twinkle, little star");
        song.add("How I wonder what you are");
        song.add("Up above the world so high");
        song.add("Like a diamond in the sky");
        song.add("Twinkle, twinkle, little star");
        song.add("How I wonder what you are");
        this.box.playSong("Twinkle Twinkle Little Star", song);
    }
    
    /**
     * plays "if you're happy and you know it" in English
     */
    public void pressHappyButton() {
        ArrayList<String> song = new ArrayList<>();
        song.add("If you're happy and you know it clap your hands");
        song.add("If you're happy and you know it clap your hands");
        song.add("If you're happy and you know it");
        song.add("And you really want to show it");
        song.add("If you're happy and you know it clap your hands");
        this.box.playSong("If you're happy and you know it", song);
    }

    /**
     * sets the music box state to english (but you are already in english)
     */
    public void pressEnglishButton() {
        System.out.println("You are already in English mode");
    }

    /**
     * sets the music box state to French
     */
    public void pressFrenchButton() {
        this.box.setState(this.box.getFrenchState());
    }
    
    /**
     * sets the music box state to spanish
     */
    public void pressSpanishButton() {
        this.box.setState(this.box.getSpanishState());
    }
}
