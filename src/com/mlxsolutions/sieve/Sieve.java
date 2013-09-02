package com.mlxsolutions.sieve;

public class Sieve {

    public int maxValue;
    public final static int DEFAULT_MAX = 100;

    public Sieve () {
	maxValue = DEFAULT_MAX;
    }

    public Sieve (int newMax) {
	maxValue = newMax;
    }

}
