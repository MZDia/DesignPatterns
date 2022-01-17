import java.util.ArrayList;
/**
 * A List of strings
 * @author Mia Dia
 */
public class Listing {
  private String title;
  private ArrayList<String> items;
  private SortBehavior sortBehavior;

  /**
   * Creates new Listing
   * @param String title to name list
   */
  public Listing(String title) {
    this.title = title;
    this.items = new ArrayList<String>();
    this.sortBehavior = new BubbleSort();
  }
  
  /**
   * Adds an item to list
   * @param String item to add
   */
  public void add(String item) {
    this.items.add(item);
  }

  /**
   * Removes an item from list
   * @param String item to remove
   */
  public void remove(String item) {
    this.items.remove(item);
  }

  /**
   * Returns the name/title of the list
   * @return A string of the title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Sets the sort behavior of the List; Either of Bubble or Insertion sort
   * @param a sortBehavior to make this list to use
   */
  public void setSortBehavior(SortBehavior sortBehavior) {
    this.sortBehavior = sortBehavior;
  }

  /**
   * Returns an ArrayList<String> of the list after sorting; does not modify items
   * @return an ArrayList<String> of the sorted items
   */
  public ArrayList<String> getSortedList() {
    return this.sortBehavior.sort(this.items);
  }

  /**
   * Returns an ArrayList<String> of the original(Unsorted) list
   * @return Returns an ArrayList<String> of the original(Unsorted) list
   */
  public ArrayList<String> getUnsortedList() {
    return this.items;
  }
}