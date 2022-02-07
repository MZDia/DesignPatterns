
public class CarFactory {
  public static Car createCar(String type, String make, String model) {
    type = type.toUpperCase();
    if (type.equals("SMALL")) {
      return new SmallCar(make, model);
    } else if (type.equals("SEDAN")) {
      return new SedanCar(make, model);
    } else { //LUXURY
      return new LuxuryCar(make, model);
    }

    // type = type.toUpperCase();
    // if (type.equals(CarType.SMALL)) {
    //   return new SmallCar(make, model);
    // } else if (type.equals(CarType.SEDAN)) {
    //   return new SedanCar(make, model);
    // } else { //LUXURY
    //   return new LuxuryCar(make, model);
    // }
  }
}
