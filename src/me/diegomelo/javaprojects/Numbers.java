package me.diegomelo.javaprojects;

import java.util.ArrayList;

public class Numbers {

    public static void main(String[] args) {
//        System.out.println(E(30));
//        System.out.println(isPrime(11));
        System.out.println(primes(100));
    }

    public static double Pi(int terms){
        double result = 3;
        for (int i = 1; i < terms; i++) {
            int n = i * 2;
            result += 4 * Math.pow(-1, i + 1) / (n * (n + 1) * (n + 2));
        }

        return result;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double E(int terms) {
        double result = 0;
        for (int i = 0; i <= terms; i++) {
            result += 1 / (double) factorial(i);
        }
        return result;
    }

    public static int[] fibonacci(int terms){
        int[] fib = new int[terms];

        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < terms; i++){
            fib = fib.clone();
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }

    public static ArrayList<Integer> primes(int n){
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i)){
                factors.add(i);
            }
        }

        System.out.println(factors);
        return factors;
    }

    public static boolean isPrime(int n){
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                divisors.add(i);
            }
        }

        System.out.println("Divisors for " + n + ": " + divisors);
        return divisors.toArray().length < 2;
    }
}
