import java.util.ArrayList;
/**
 * Bubble Sort
 * @author Mia Dia
 */
public class BubbleSort implements SortBehavior {
  
  /**
   * Sorts an arraylist of strings using the Bubble sort method
   * @param an ArrayList<String> of items to sort
   * @return a sorted ArrayList<String> of items
   */
  public ArrayList<String> sort(ArrayList<String> items) {
    //Referenced https://www.geeksforgeeks.org/bubble-sort/
    int len = items.size();
    for (int i = 1; i < len; i++) {
      for (int j = 0; j < len - i; j++) {
        if (items.get(j).compareTo(items.get(j+1)) > 0) {
          String temp = items.get(j);
          items.set(j, items.get(j+1));
          items.set(j+1, temp);
        }
      }
    }
    return items;
  }
}