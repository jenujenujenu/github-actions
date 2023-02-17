package dhbw;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Calculator1 calculator = new Calculator1();

        // add
        BigInteger result = calculator.add(BigInteger.valueOf(3),
            BigInteger.valueOf(2));
        System.out.println("Add two numbers: " + result);
    }

}
