/**
 * Subject interface
 * @author Mia Dia
 */
public interface Subject {

  /**
   * Add an observer to the list
   * @param observer of type Observer to add
   */
  public void registerObserver(Observer observer);

  /**
   * Remove an observer to the list
   * @param observer of type Observer to remove
   */
  public void removeObserver(Observer observer);

  /**
   * notify/update all observers on current data
   */
  public void notifyObservers();
}
