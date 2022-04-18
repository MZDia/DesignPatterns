/**
 * "Music box" Holds all music states
 * @author Mia Dia
 */
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    public MusicBox() {
        this.englishState = new EnglishState(this);
        this.frenchState = new FrenchState(this);
        this.spanishState = new Spanish(this);
        this.state = new EnglishState(this);
    }

    public void pressStarButton() {
        this.state.pressStarButton();
    }

    public void pressHappyButton() {
        this.state.pressHappyButton();
    }

    public void pressEnglishButton() {
        this.state.pressEnglishButton();
    }

    public void pressFrenchButton() {
        this.state.pressFrenchButton();
    }

    public void pressSpanishButton() {
        this.state.pressSpanishButton();
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getEnglishState() {
        return this.englishState;
    }

    public State getFrenchState() {
        return this.frenchState;
    }

    public State getSpanishState() {
        return this.spanishState;
    }

    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("\nPlaying :" + songName);
        for (String line: lyrics) {
            System.out.println(line);
            sleep(1000);
        }
        System.out.println();

    }

    //Writen By Portia Plante
    /**
     * Sleep / Pause the console for a certain number of miliseconds
     * @param num number of mili seconds to pause
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }
}
