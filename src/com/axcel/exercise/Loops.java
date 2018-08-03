package com.axcel.exercise;

import java.util.ArrayList;

public class Loops {

    /**
     * Salmple for loop
     * @param n
     * @return
     */
    ArrayList<Long> findTopPrime(int n){
        ArrayList<Long> result = new ArrayList<Long> ();
        long p=0;
        for (int i = 0; i < n; i++) {
            p = getNextPrime(p);
            result.add(p);
            p++;
        }

        return result;
    }

    /**
     * Sample while loop
     * @param p
     * @return
     */
    private long getNextPrime(long p) {
        long pri = p;
        while (true ){
            if (isPrime(pri)){

                return pri;

            }
            pri++;

        }


    }

    /**
     * is prime find if the number is prime
     * Sample foor loop
     * @param p
     * @return
     */
    private boolean isPrime(long p) {
        if (p==0||p==1)
            return false;
        long k = (long) Math.sqrt(Math.abs(p))+1;
        for (long i = 2; i < k; i++) {
            if (p%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Loops loops = new Loops();
        ArrayList<Long> primes = loops.findTopPrime(20);
        primes.stream().forEach(System.out::println);
        System.out.println(  loops.getNextPrime(1901843709));
    }


}
