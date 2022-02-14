import java.util.ArrayList;
/**
 * An object that holds a list of target mucsles and directions for an exercise
 * @author Mia Dia
 */
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscle;
    private ArrayList<String> directions;

    /**
     * Creates a new exercise 
     * @param title The name of the exercise
     */
    public Exercise(String title) {
        this.title = title;
        this.targetMuscle = new ArrayList<String>();
        this.directions = new ArrayList<String>();
    }

    /**
     * Creates a new exercise
     * @param title name of exercise
     * @param targetMuscle Arraylist<Strings> of muscles
     * @param directions Arraylist<String> of directions
     */
    public Exercise(String title, ArrayList<String> targetMuscle, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscle = targetMuscle;
        this.directions = directions;
    }

    /**
     * adds a target muscle to the list
     * @param muscle name of muscle
     */
    public void addTargetMuscle(String muscle) {
        this.targetMuscle.add(muscle);
    }

    /**
     * removes a muscle from the list
     * @param muscle name of muscle to remove
     */
    public void removeTargetMuscle(String muscle) {
        this.targetMuscle.remove(muscle);
    }

    /**
     * returns a string representation of title, targeted muscles, and directions
     */
    public String toString() {
        String ret = "... " + this.title + " ...\nMuscles: ";
        for (int i = 0; i <= targetMuscle.size() - 1; i++) {
            ret += this.targetMuscle.get(i) + ", ";
        }
        ret += "\nExercises:\n";
        for (int i = 0; i <= directions.size() - 1; i++) {
            ret += "- " + this.directions.get(i) + "\n";
        }
        ret += "\n";
        return ret;
    }
} 
