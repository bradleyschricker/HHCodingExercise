package com.example.brad.hhcodingexercise;

/**
 * Created by Brad on 11/3/2014.
 */
public class Secret {

    public int secret1(int input) {
        return 10 * input;
    }

    public int secret2(int input) {
        return input * input;
    }

    public boolean[] findPrimes (int limit) {
        int limitSqRoot = (int) Math.sqrt(limit);
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 0; i < limit + 1; i++) {
            isPrime[i] = true;
        }

        for (int j = 2; j <= limitSqRoot; j++) {
            if (isPrime[j]) {
                for (int k = j * j; k <= limit; k += j)
                    isPrime[k] = false;
            }
        }

        return isPrime;

    }
}
