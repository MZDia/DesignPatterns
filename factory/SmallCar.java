/**
 * Makes a small Car with all specific specifications
 * @author Mia Dia
 */

public class SmallCar extends Car {

  /**
  * Makes a new small car; prints out the name of the car, the assembly of car, and the accessories
  * @param make name of the car make
  * @param model name of the car model
  */
  public SmallCar(String make, String model) {
    super(make, model);
  }
    
   /**
   * displays that a small frame is being added
   */
  protected void addFrame() {
    System.out.println("Adding a small frame"); 
  }

   /**
   * adding all accessories a small car has to the list of accessories
   */
  protected void addAccessories() {
    this.accessories.add(Accessories.FLOOR_MATTS);
    this.accessories.add(Accessories.PHONE_CHARGER);
  }
}
    