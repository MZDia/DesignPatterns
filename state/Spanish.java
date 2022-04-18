import java.util.ArrayList;
/**
 * The spanish state for Music Box and holds it's information
 * @author Mia Dia
 */
public class Spanish implements State {
    private MusicBox box;

    /**
     * Creates an instant of Spanish (state) for the music box
     * @param MusicBox box, the object music box
     */
    public Spanish(MusicBox box) {
        this.box = box;
    }

    /**
     * plays "Twinkle twinkle little star" in spanish
     */
    public void pressStarButton() {
        ArrayList<String> song = new ArrayList<>();
        song.add("Brilla brilla pequeña estrella");
        song.add("Cómo me pregunto lo que eres");
        song.add("Por encima del mundo tan arriba");
        song.add("Como un diamante en el cielo");
        song.add("Brilla brilla pequeña estrella");
        song.add("Cómo me pregunto lo que eres");
        this.box.playSong("Brilla brilla pequeña estrella", song);
    }
    
     /**
     * plays "if you're happy and you know it" in french
     */
    public void pressHappyButton() {
        ArrayList<String> song = new ArrayList<>();
        song.add("Si eres feliz y lo sabes aplaude");
        song.add("Si eres feliz y lo sabes aplaude");
        song.add("si estás contento y lo sabes");
        song.add("Y realmente quieres mostrarlo");
        song.add("Si eres feliz y lo sabes aplaude");
        this.box.playSong("si estás contento y lo sabes", song);
    }

    /**
     * sets the music box state to english
     */
    public void pressEnglishButton() {
        this.box.setState(this.box.getEnglishState());
    }

    /**
     * sets the music box state to french
     */
    public void pressFrenchButton() {
        this.box.setState(this.box.getFrenchState());
    }
    
    /**
     * sets the music box state to spanish (but it already is)
     */
    public void pressSpanishButton() {
        System.out.println("You are already in Spanish mode");
    }
}
