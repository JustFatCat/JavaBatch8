package com.syntax.class16;

public class MainForChecking {
    public static void main(String[] args) {
        HW1AnotherVariant hm1 = new HW1AnotherVariant();

        String email = hm1.createEmail("Sonya", "Kosh", "google");
        System.out.println(email);

        HW2AnotherVariant hm2 = new HW2AnotherVariant();
        boolean prime = hm2.isPrime(25);
        boolean prime1 = hm2.isPrime(1);
        boolean prime2 = hm2.isPrime(10);
        System.out.println("isPrime(25) " + prime);
        System.out.println("isPrime(1) " + prime1);
        System.out.println("isPrime(10) " + prime2);




    }

}
