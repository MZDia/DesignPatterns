import java.util.HashMap;
/**
 * Displays how many votes each president has, 
 * based on the values in the votes HashMap.
 * @author Mia Dia
 */
public class TallyDisplay implements Observer{
  private Subject poll;
  private HashMap<String, Integer> votes;

  /**
   * Creates a new Tally Display
   * @param poll Subject object that holds the poll data
   */
  public TallyDisplay(Subject poll) {
    this.poll = poll;
    this.poll.registerObserver(this);
  }

  /**
   * Update the current votes
   * @param a HashMap representing all the votes
   */
  public void update(HashMap<String, Integer> votes) {
    this.votes = votes;
    display();
  }
  
  /**
   * Prints out all votes with corresponding president
   */
  private void display() {
    for (String key : this.votes.keySet()) {
      System.out.println(key + ": " + this.votes.get(key));
    }
    System.out.println();
  }
}
