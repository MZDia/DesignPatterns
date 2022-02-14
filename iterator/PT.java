import java.util.ArrayList;
/**
 * New physical training profile
 * @author Mia Dia
 */
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    private int numExercises;

    /**
     * Creates a new physcial training regimine
     * @param firstName (String) First name
     * @param lastName (String) Last name
     * @param bio (String) bio- a sentence or so to describe them
     */
    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.exercises = new Exercise[2];
        this.numExercises = 0;
    }

    /**
     * adds an exercise to the list
     * @param title name of exercise
     * @param muscleGroups ArrayList<String> of muscles
     * @param directions ArrayList<String> of directions
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        if (++this.numExercises >= exercises.length) {
            this.exercises = growArray(this.exercises);
        } 
        this.exercises[numExercises - 1] = new Exercise(title, muscleGroups, directions);
    }

    /**
     * return first name
     * @return first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * return last name
     * @return last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * return bio
     * @return bio
     */
    public String getBio() {
        return this.bio;
    }

    /**
     * returns an array of twice the size with the same data
     * @param exercises array of exercises
     * @return new array with doubled size with same data
     */
    private Exercise[] growArray(Exercise[] exercises) {
        Exercise[] ret = new Exercise[exercises.length*2];
        for (int i = 0; i <= exercises.length - 1; i++) {
            ret[i] = exercises[i];
        }
        return ret;
    }

    /**
     * return a new Exercise Iterator for current exercises
     * @return new Exercise Iterator
     */
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(this.exercises);
    }

    /**
     * returns patient's full name and bio
     */
    public String toString() {
        return this.firstName + " " + this.lastName + "\n" + this.bio + "\n" ;
    }

}
