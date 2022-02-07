/**
 * Makes a Sedan Car with all specific specifications
 * @author Mia Dia
 */

public class SedanCar extends Car {
  /**
  * Makes a new Sedan car; prints out the name of the car, the assembly of car, and the accessories
  * @param make name of the car make
  * @param model name of the car model
  */
  public SedanCar(String make, String model) {
    super(make, model);
 }
  
 /**
   * displays that a three part frame is being added
   */
  protected void addFrame() {
    System.out.println("Adding a three part frame");
  }

 /**
 * adding all accessories a sedan car has to the list of accessories
 */
 protected void addAccessories() {
    this.accessories.add(Accessories.FLOOR_MATTS);
    this.accessories.add(Accessories.PHONE_CHARGER);
    this.accessories.add(Accessories.BACK_UP_CAMERA);
    this.accessories.add(Accessories.EXTRA_CUP_HOLDERS);
    this.accessories.add(Accessories.HEATED_SEATS);
  }
}
  