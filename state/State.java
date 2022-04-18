/**
 * Interface for the different music box states
 * @author Mia Dia
 */
public interface State {
    /**
     * plays twinkle twinkle tittle star
     */
    public void pressStarButton();

    /**
     * plays if you're happy and you know it
     */
    public void pressHappyButton();

    /**
     * sets music box state to english
     */
    public void pressEnglishButton();

    /**
     * sets music box state to french
     */
    public void pressFrenchButton();

    /**
     * sets music box state to spanish
     */
    public void pressSpanishButton();
}
