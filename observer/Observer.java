import java.util.HashMap;
/**
 * Observer interface
 * @author Mia Dia
 */
public interface Observer {
    /**
     * updates the observer to the current poll of votes
     */
    public void update(HashMap<String, Integer> votes);
}
