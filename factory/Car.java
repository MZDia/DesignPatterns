import java.util.ArrayList;
/**
 * Class car; makes a new car and prints out the assembly & car name
 * @author Mia Dia
 */
abstract public class Car {
  private String make;
  private String model;
  protected ArrayList<Accessories> accessories;

  /**
   * Makes a new car; prints out the name of the car, the assembly of car, and the accessorie
   * @param make name of the car make
   * @param model name of the car model
   */
  public Car(String make, String model) {
    this.make = make;
    this.model = model;
    this.accessories = new ArrayList<Accessories>();
    System.out.println("Creating a " + this.make + " " + this.model);
    assemble();
  }

  /**
   * calls all assembly methods and displays accessories
   */
  public void assemble() {
    addFrame();
    addWheels();
    addEngine();
    addWindows();
    addAccessories();
    displayAccessories();
  }

  /**
   * displays the type of frame being added
   */
  protected abstract void addFrame();

  /**
   * displays that the wheels are added
   */
  protected void addWheels() {
    System.out.println("Adding the Wheels");
  }

  /**
   * displays that the standard engine is added
   */
  protected void addEngine() {
    System.out.println("Adding a Standard Engine");
  }

  /**
   * displays that the windows are added
   */
  protected void addWindows() {
    System.out.println("Adding Windows");
  }

  /**
   * adds any accessories the car has to the list of accessories
   */
  protected abstract void addAccessories();

  /**
   * displays all accessories
   */
  protected void displayAccessories() {
    System.out.println("Accessories:");
    for (int i = 0; i < this.accessories.size(); i++) {
      System.out.println("- " + this.accessories.get(i));
    }
  }
}
