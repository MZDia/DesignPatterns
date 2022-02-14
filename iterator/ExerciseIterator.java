import java.util.Iterator;
/**
 * An iterator for an array of exercises
 * @author Mia Dia
 */
public class ExerciseIterator {
    private Exercise[] exercises;
    private int position;

    /**
     * creates a new exercise iterator starting at position 0
     * @param exercises array of exercises
     */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
        this.position = 0;
    }

    /**
     * returns a bool based on if there is a next object
     * @return a bool based on if there is a next object
     */
    public boolean hasNext() {
        if (exercises[position] == null) {
            return false;
        }
        return true;
    }

    /**
     * returns the next exercise
     * @return the next exercise of type Exercise
     */
    public Exercise next() {
        return this.exercises[this.position++];
    }

}