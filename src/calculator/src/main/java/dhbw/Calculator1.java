package dhbw;

import java.math.BigInteger;

public class Calculator1 {

  /**
   * Add two numbers by using addition
   * @param a First number (left from + sign)
   * @param b Second number (right from + sign)
   * @return Result of the addition
   */
  public BigInteger add(BigInteger a, BigInteger b) {
    BigInteger result = BigInteger.valueOf(0);
    try {
      result = a.add(b);
    } catch (ArithmeticException ex) {
      throw new ArithmeticException("Can't add values " + a + " and " + b);
    } catch (NullPointerException ex) {
      throw new NullPointerException("Can't add with null values");
    }
    return result;
  }

  /**
   * Substract two numbers by using substraction giving the difference between two numbers
   * @param a The number left from the - sign which the second number will be substracted from 
   * @param b The number right from the - sign which will be substracted from the first one
   * @return Result of the substraction
   */
  public int substract(int a, int b) {
    return a-b;
  }

  /**
   * Divide two numbers
   * @param a The number left from the / sign which will be divided
   * @param b The number right from the / sign which the first number will be divided by 
   * @return Result of the division
   */
  public int divide(int a, int b) {
    return a/b;
  }

  /**
   * Multiply two numbers
   * @param a The first multiplied number left from the * sign
   * @param b The second multiplied number right from the * sign
   * @return Result of the multiplication
   */
  public int multiply(int a, int b) {
    return a*b;
  }

}
