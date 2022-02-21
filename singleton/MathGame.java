import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
/**
 * Creates an instance of the MathGame
 * @author Mia Dia
 */
public class MathGame {
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String[] operands;

    /**
     * creates a new MathGame
     */
    private MathGame() {
        this.operands = new String[]{"+", "-", "*", "/"};
        this.rand = new Random();
        this.reader = new Scanner(System.in);
        this.score = 0;
    }
    
    /**
     * checks if there is an instance of MathGame already made; if not, then return a new MathGame; if yes, return current MathGame
     * @return the only instance of MathGame
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
           return new MathGame();
        }
        return mathGame;
    }

    /**
     * runs the mathGame
     */
    public void play() {
        System.out.println("Let's have fun with Math!");
        boolean inGame = true;
        String input;
        while (inGame) {
            System.out.print("(P)lay or (Q)uit: ");
            input = reader.nextLine().toLowerCase();
            System.out.println();
            if (input.equals("p")) {
                if (playRound()) {
                    this.score += 1;
                }
            } 
            else if (input.equals("q")) {
                System.out.println("You won " + this.score + " games!");
                inGame = false;
            } 
            else {
                System.out.println("Sorry, you must enter p or q");
            }
        }
        System.out.println("Goodbye");
    }

    /**
     * calculates random questions for the user to answer
     * @return boolean for if the player got the answer right or wrong
     */
    private boolean playRound() {
        System.out.println("Round answer to 1 decimal place");
        int operand = this.rand.nextInt(4);
        int numONE = this.rand.nextInt(101);
        int numTWO = this.rand.nextInt(101);
        double answer = 0;

        if (operand == 0) {
            System.out.print(numONE + " + " + numTWO + " = ");
            answer = numONE + numTWO;
        } else if (operand == 1) {
            System.out.print(numONE + " - " + numTWO + " = ");
            answer = numONE - numTWO;
        } else if (operand == 2) {
            System.out.print(numONE + " * " + numTWO + " = ");
            answer = numONE * numTWO;
        } else {
            System.out.print(numONE + " / " + numTWO + " = ");
            answer = numONE / numTWO;
            answer = Math.round(answer * 10)/10;
        }

        double input = reader.nextDouble();
        if (input == answer) {
            System.out.println("You got it!");
            return true;
        }
        System.out.println("The correct answer is: " + answer);
        return false;
    }
}