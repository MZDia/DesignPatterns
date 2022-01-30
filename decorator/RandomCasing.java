import java.util.Random;
/**
 * A Password Decorator that changes the casing of letters
 * @author Mia Dia
 */

public class RandomCasing extends PasswordDecorator{
  /**
   * Creates a new random casing password obj
   * @param passwordBeginning A string that represents the original password
   */
  public RandomCasing(Password passwordBeginning) {
    super(passwordBeginning);
  }

  /**
   * Returns the password with each letter having a 50/50 chance of being upper or lower case
   * @return A string of the modified password
   */
  public String getPassword() {
    String ret = this.passwordBeginning.getPassword();
    Random random = new Random();
    String letter = "";
    for (int i = 0; i < ret.length(); i++) {
      if(random.nextInt(2) == 1) {
        letter = (ret.charAt(i) + "").toUpperCase();
      } else {
        letter = (ret.charAt(i) + "").toLowerCase();
      }
      ret = ret.substring(0, i) + letter + ret.substring(i+1);
    }
    return ret;
  }
}