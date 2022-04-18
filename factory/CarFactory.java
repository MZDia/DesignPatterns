/**
 * Car factory; makes a specific car depending on the type
 * @author Mia Dia
 */
public class CarFactory {
  /**
   * Returns a car of the specified type with the make and model
   * @param type type of car (SMALL, SEDAN, LUXURY)
   * @param make make of car
   * @param model model of car
   * @return a new Car of the specified typing
   */
  public static Car createCar(String type, String make, String model) {
    type = type.toUpperCase();
    if (type.equals(CarType.SMALL.toString())) {
      return new SmallCar(make, model);
    } else if (type.equals(CarType.SEDAN.toString())) {
      return new SedanCar(make, model);
    } else { //LUXURY
      return new LuxuryCar(make, model);
    }
  }
}
