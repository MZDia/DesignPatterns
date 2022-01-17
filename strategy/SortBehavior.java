import java.util.ArrayList;
/**
 * Sort Behavior Interface
 * @author Mia Dia
 */
public interface SortBehavior {

  /**
   * Sorts an arraylist of strings
   * @param an ArrayList<String> of items to sort
   * @return a sorted ArrayList<String> of items
   */
  public ArrayList<String> sort(ArrayList<String> items);
}