import java.util.ArrayList;

abstract public class Car {
  private String make;
  private String model;
  protected ArrayList<Accessories> accessories;

  public Car(String make, String model) {
    this.make = make;
    this.model = model;
    this.accessories = new ArrayList<Accessories>();
    System.out.println("Creating a " + this.make + " " + this.model);
    assemble();
  }

  public void assemble() {
    addFrame();
    addWheels();
    addEngine();
    addWindows();
    addAccessories();
    displayAccessories();
  }

  protected abstract void addFrame();

  protected void addWheels() {
    System.out.println("Adding the Wheels");
  }

  protected void addEngine() {
    System.out.println("Adding a Standard Engine");
  }

  protected void addWindows() {
    System.out.println("Adding Windows");
  }

  protected abstract void addAccessories();

  protected void displayAccessories() {
    System.out.println("Accessories:");
    for (int i = 0; i < this.accessories.size(); i++) {
      System.out.println("- " + this.accessories.get(i));
    }
  }
}
