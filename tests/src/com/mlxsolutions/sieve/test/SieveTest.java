package com.mlxsolutions.sieve.test;

import junit.framework.Assert;
import android.test.AndroidTestCase;

import com.mlxsolutions.sieve.Sieve;

/**
 * A test suite containing all tests for my application.
 */
public class SieveTest extends AndroidTestCase {

    private Sieve out;

    public void testConstructor__whenGivenMaxValue__setsMaxValueToProvidedValue() throws Throwable {
        int expected = Sieve.DEFAULT_MAX * 2;
        Sieve sieve = new Sieve(expected);
        Assert.assertEquals(expected, sieve.maxValue);
    }

    public void testConstructor__whenNotGivenMaxValue__defaultsToDEFAULT_MAX() throws Throwable {
        Assert.assertEquals(Sieve.DEFAULT_MAX, out.maxValue);
    }

    public void testConstructor__whenGivenMIN_VALUE__DoesNotThrowIllegalArgumentException() throws Throwable {
        boolean errorThrown;
        try {
            Sieve out = new Sieve(Sieve.MIN_VALUE);
            errorThrown = false;
        }
        catch (IllegalArgumentException e) {
            errorThrown = true;
        }
        Assert.assertFalse(errorThrown);
    }

    public void testConstructor__whenGivenOneLessThanMIN_VALUE__ThrowsIllegalArgumentException() throws Throwable {
        boolean errorThrown;
        try {
            Sieve out = new Sieve(Sieve.MIN_VALUE - 1);
            errorThrown = false;
        }
        catch (IllegalArgumentException e) {
            errorThrown = true;
        }
        Assert.assertTrue(errorThrown);
    }

    public void testGetPrimes__whenGivenValidMaxValuesInConstructor__returnsExpectedResults() throws Throwable {
        int[] expected = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };
        Sieve sieve = new Sieve( 20 );

        int[] results = sieve.GetPrimes();

        boolean success = expected.length == results.length;
        if (success) {
            for (int i=0; success && i<expected.length; i++) {
                success = expected[i] == results[i];
            }
        }
        Assert.assertTrue(success);
    }

    public void setUp () {
        out = new Sieve();
    }

    public void tearDown () {
        out = null;
    }
}
