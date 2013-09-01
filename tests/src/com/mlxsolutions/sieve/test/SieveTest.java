package com.mlxsolutions.sieve.test;

import junit.framework.Assert;
import android.test.AndroidTestCase;

import com.mlxsolutions.sieve.Sieve;

/**
 * A test suite containing all tests for my application.
 */
public class SieveTest extends AndroidTestCase {

    public void testConstructor__whenGivenMaxValue__setsMaxValueToProvidedValue() throws Throwable {
    	Integer expected = 250;
    	Sieve sieve = new Sieve(expected);
    	Assert.assertTrue(sieve.maxValue == expected);
     }

    public void testConstructor__whenNotGivenMaxValue__defaultsTo100() throws Throwable {
    	Sieve sieve = new Sieve();
        Assert.assertTrue(sieve.maxValue == 100);
     }

}
