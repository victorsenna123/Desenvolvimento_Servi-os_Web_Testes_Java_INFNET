package org.example;


public class FactorialCalculator {

    public static long factorial(int number) {
        if (number < 0) {
            throw new ArithmeticException("Fatorial não é definido para números negativos.");
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
