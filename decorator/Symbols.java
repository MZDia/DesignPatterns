/**
 * A Password Decorator that replaces specific chars into symbols
 * @author Mia Dia
 */

public class Symbols extends PasswordDecorator {
  /**
   * Creates a new symbol password obj
   * @param passwordBeginning A string that represents the original password
   */
  public Symbols(Password passwordBeginning) {
    super(passwordBeginning);
  }

 /**
   * Returns the password that replaces certain chars with symbols (such as a to @)
   * @return A string of the modified password
   */
  public String getPassword() {
    String ret = this.passwordBeginning.getPassword();
    ret = ret.replace("a", "@");
    ret = ret.replace("b", "8");
    ret = ret.replace("e", "3");
    ret = ret.replace("g", "9");
    ret = ret.replace("i", "!");
    ret = ret.replace("o", "0");
    ret = ret.replace("s", "$");
    ret = ret.replace("t", "7");
    return ret;
  }
}
