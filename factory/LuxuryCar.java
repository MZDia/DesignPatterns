/**
 * Makes a Luxury Car with all specific specifications
 * @author Mia Dia
 */

public class LuxuryCar extends Car{
  /**
  * Makes a new luxury car; prints out the name of the car, the assembly of car, and the accessories
  * @param make name of the car make
  * @param model name of the car model
  */
  public LuxuryCar(String make, String model) {
      super(make, model);
  }

   /**
   * displays that a beautiful frame is being added
   */
  protected void addFrame() {
    System.out.println( "Adding a beautiful frame");
  }

  /**
   * displays that a supped up engine is being added
   */
  protected void addEngine() {
    System.out.println("Adding a Supped Up Engine");
  }

  /**
   * adding all accessories a luxury car has to the list of accessories
   */
  protected void addAccessories() {
    this.accessories.add(Accessories.FLOOR_MATTS);
    this.accessories.add(Accessories.PHONE_CHARGER);
    this.accessories.add(Accessories.BACK_UP_CAMERA);
    this.accessories.add(Accessories.EXTRA_CUP_HOLDERS);
    this.accessories.add(Accessories.HEATED_SEATS);
    this.accessories.add(Accessories.SPORTS_SEATS);
    this.accessories.add(Accessories.WINDOW_TINT);
    this.accessories.add(Accessories.HIGH_END_SOUND);
    this.accessories.add(Accessories.TRUNK_ORGANIZER);
    this.accessories.add(Accessories.BLUE_TOOTH);
  }
}
