import java.util.ArrayList;
/**
 * Insertion Sort
 * @author Mia Dia
 */

public class InsertionSort implements SortBehavior {
  
  /**
   * Sorts an arraylist of strings using the insertion sort method
   * @param an ArrayList<String> of items to sort
   * @return a sorted ArrayList<String> of items
   */
  public ArrayList<String> sort(ArrayList<String> items) {
    //referenced https://stackoverflow.com/questions/35097227/insertion-sort-java-algorithm-in-an-arraylist-string
    for (int i = 1; i < items.size(); i++) {
      String curr = items.get(i);
      int j = i - 1;
      while (j >= 0 && curr.compareTo(items.get(j)) < 0) {
          items.set(j + 1, items.get(j));
          j--;
      }
      items.set(j + 1, curr);
    }
    return items;
  }
}