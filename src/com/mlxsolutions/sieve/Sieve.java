package com.mlxsolutions.sieve;

public class Sieve {

    public int maxValue;
    public final static int DEFAULT_MAX = 100;
    public final static int MIN_VALUE = 2;

    public Sieve () {
	maxValue = DEFAULT_MAX;
    }

    public Sieve (int newMax) throws Exception {
	if (newMax < MIN_VALUE) {
	    throw( new IllegalArgumentException() );
	}
	maxValue = newMax;
    }

}
