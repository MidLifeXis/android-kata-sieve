package com.mlxsolutions.sieve;

public class Sieve {

    public int maxValue;
    public final static int DEFAULT_MAX = 100;
    public final static int MIN_VALUE = 2;

    private final static int PRIME_UNKNOWN = 0;
    private final static int PRIME_YES = 1;
    private final static int PRIME_NO  = 2;

    public Sieve () {
        maxValue = DEFAULT_MAX;
    }

    public Sieve (int newMax) throws Exception {
        if (newMax < MIN_VALUE) {
            throw( new IllegalArgumentException() );
        }
        maxValue = newMax;
    }

    public int[] GetPrimes() {
        int[] primesData = new int[maxValue+1];
        int[] results    = new int[maxValue];

        int i;
        int result_count = 0;

        for (i=MIN_VALUE; i<=maxValue; i++) {
            primesData[i] = PRIME_UNKNOWN;
        }
        for (i=MIN_VALUE; i<=maxValue; i++) {
            if (primesData[i] == PRIME_UNKNOWN) {
                primesData[i] = PRIME_YES;
                results[result_count++] = i;
                int j;
                for (j=i; j<=maxValue; j = j + i) {
                    primesData[j] = PRIME_NO;
                }
            }
        }

        int[] retval = new int[result_count];
        for (i=0; i<result_count; i++) {
            retval[i] = results[i];
        }
        return retval;
    }

}
