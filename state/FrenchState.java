import java.util.ArrayList;
/**
 * The french state for Music Box and holds it's information
 * @author Mia Dia
 */
public class FrenchState implements State {
    private MusicBox box;

    /**
     * Creates an instant of FrenchState for the music box
     * @param MusicBox box, the object music box
     */
    public FrenchState(MusicBox box) {
        this.box = box;
    }

    /**
     * plays "Twinkle twinkle little star" in french
     */
    public void pressStarButton() {
        ArrayList<String> song = new ArrayList<>();
        song.add("Scintille, scintille, petite étoile");
        song.add("Comment je me demande ce que vous êtes");
        song.add("Au-dessus du monde si haut");
        song.add("Comme un diamant dans le ciel");
        song.add("Scintille, scintille, petite étoile");
        song.add("Comment je me demande ce que vous êtes");
        this.box.playSong("Scintille, scintille, petite étoile", song);
    }

     /**
     * plays "if you're happy and you know it" in french
     */
    public void pressHappyButton() {
        ArrayList<String> song = new ArrayList<>();
        song.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        song.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        song.add("Si tu es content et que tu le sais");
        song.add("Et tu veux vraiment le montrer");
        song.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        this.box.playSong("Si tu es content et que tu le sais", song);
    }

    /**
     * sets the music box state to english
     */
    public void pressEnglishButton() {
        this.box.setState(this.box.getEnglishState());
    }

    /**
     * sets the music box state to french (but you are already in french)
     */
    public void pressFrenchButton() {
        System.out.println("You are already in French mode");
    }
    
    /**
     * sets the music box state to spanish
     */
    public void pressSpanishButton() {
        this.box.setState(this.box.getSpanishState());
    }
}
