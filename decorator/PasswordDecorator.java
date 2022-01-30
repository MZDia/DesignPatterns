/**
 * An abstract class of Password Decorator
 * @author Mia Dia
 */
public abstract class PasswordDecorator extends Password {
  protected Password passwordBeginning;

  /**
   * Creates a new passowrd decorator obj
   * @param passwordBeginning A string that represents the original password
   */
  public PasswordDecorator(Password passwordBeginning) {
    this.passwordBeginning = passwordBeginning;
  }

  /**
   * Returns the password that has been modified in a specific way
   * @return A string of the modified password
   */
  public String getPassword() {
    return this.passwordBeginning.getPassword();
  }
}
