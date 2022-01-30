import java.util.Random;
/**
 * A Password Decorator that adds special chars after each letter 30% of the time
 * @author Mia Dia
 */

public class SpecialChars extends PasswordDecorator {
  /**
   * Creates a new special charater password obj
   * @param passwordBeginning A string that represents the original password
   */
  public SpecialChars(Password passwordBeginning) {
    super(passwordBeginning);
  }

  /**
   * Returns the password with a 30% chance of having a special char after each character in the password
   * @return A string of the modified password
   */
  public String getPassword() {
    String ret = this.passwordBeginning.getPassword();
    Random random = new Random();
    int randNum = 0;
    String specialChar = "";
    for (int i = 0; i < ret.length(); i++) {
      if(random.nextInt(3) == 2) {
        randNum = random.nextInt(7);
        if (randNum == 0) {
          specialChar = "*";
        } else if (randNum == 1) {
          specialChar = "!";
        } else if (randNum == 2) {
          specialChar = "%";
        } else if (randNum == 3) {
          specialChar = "+";
        } else if (randNum == 4) {
          specialChar = ".";
        } else if (randNum == 5) {
          specialChar = "{";
        } else {
          specialChar = "}";
        }
        ret = ret.substring(0, i+1) + specialChar + ret.substring(i+1);
        i++;
      }
    }
    return ret;
  }
}