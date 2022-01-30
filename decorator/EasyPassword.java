import java.util.Random;
/**
 * Extends password- Removes spaces and adds a number to the end of a password
 * @author Mia Dia
 */
public class EasyPassword extends Password {

  /**
   * making a new easy password
   * @param phrase: A string that represents the base password
   */
  public EasyPassword(String phrase) {
    this.password = phrase;
  }
  
  /**
   * Returns the password with no spaces and with a random number (0-100) 
   * @return A string of the modified password
   */
  public String getPassword() {
    String ret = this.password.replace(" ", "");
    Random random = new Random();
    return ret + (random.nextInt(101));
  }
}