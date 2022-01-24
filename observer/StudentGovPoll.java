import java.util.ArrayList;
import java.util.HashMap;
/**
 * A list of votes for the student government poll and alerts observers
 * @author Mia Dia
 */

public class StudentGovPoll implements Subject{
  private ArrayList<Observer> observers = new ArrayList<Observer>();
  private HashMap<String, Integer> votes = new HashMap<String, Integer>();
  private String school;
  private int numUpdates = 0;

  /**
   * Creates a new government poll list for a specified school
   * @param school Name of the school
   */
  public StudentGovPoll(String school) {
    this.school = school;
  }

  /**
   * Adds a new observer to the observers list
   * @param observer an Observer to add to the list
   */
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }
  
  /**
   * Removes a current observer from the observers list
   * @param observer an Observer to remove
   */
  public void removeObserver(Observer observer) {
    this.observers.remove(observer);
  }

  /**
   * Notify/update all observers on current poll
   */
  public void notifyObservers() {
    for (int i = 0; i < this.observers.size(); i++) {
      this.observers.get(i).update(this.votes);
    }
  }
  
  /**
   * Adds a new candidate to the votes list with 0 votes
   * @param president a String to represent the president
   */
  public void addCandidate(String president) {
    this.votes.put(president, 0);
  }

  /**
   * Adds a certain number of votes to a certain president; also updates variable votes
   * @param a string that represents the president voted for
   * @param an int num that represent the number of votes added
   */
  public void enterVotes(String president, int num) {
    if (this.votes.get(president) == null) {
      addCandidate(president);
    }
    this.votes.put(president, this.votes.get(president)+num);
    this.numUpdates++;
    if (this.numUpdates == 4) {
      this.numUpdates = 0;
      notifyObservers();
    }
  }
  
  /**
   * returns the name of the school
   * @return a string representing the name of the school
   */
  public String getSchool() {
      return this.school;
  }
}
