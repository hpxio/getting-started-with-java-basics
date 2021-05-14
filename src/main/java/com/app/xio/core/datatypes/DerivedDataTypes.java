/*
 * ===================================================================================
 * FILE-NAME: DerivedDataTypes.java
 * -----------------------------------------------------------------------------------
 * FQN-ID: com.app.sa.datatypes.DerivedDataTypes
 * -----------------------------------------------------------------------------------
 * DESCRIPTION:
 * -----------------------------------------------------------------------------------
 * CHANGELOG:
 * 1. File formatted and header added on 20-01-2019, 11:45 for GettingStartedWithJavaBasics
 * -----------------------------------------------------------------------------------
 * Copyright @ 2019, iHSPA
 * ===================================================================================
 */
package com.app.xio.core.datatypes;

import com.app.xio.console.conso.ConsoleIO;

/**
 * @author COM
 */
public class DerivedDataTypes { // Arrays & Enumerators - Simplest Derived Data types //

    // TODO: What is the difference b/w the two declarations below? //
    // In this type the arrays are initialized with the given numbers //
    private int[] intOnesnumeralsArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

    // Using the new keyword the arrays are initialized with default types values according to their datatypes //
    private int[] intOOnesnumeralsArray = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

    // FIXME: Is this correct way of coding array to have dynamic number of elements?? //

    // In this the array is created on size 1 integer (4bytes) but it is not initialized //
    private int[] intSomeArray;

    // To store user defined index size for the array //
    private int intIndexCtr;

    /**
     *
     */
    public DerivedDataTypes ( ) {
        intIndexCtr = 1;
        intSomeArray = new int[ intIndexCtr ];
        intSomeArray[ 0 ] = 0;
    }

    /**
     * @param index
     */
    public DerivedDataTypes ( int index ) {
        intIndexCtr = index;
        intSomeArray = new int[ intIndexCtr ];
    }

    /**
     *
     */
    public void doDisplayIntegerArrayVals ( int[] array ) {
        int ctr = 0;

        // Get the length //
        System.out.println ( "Indexes Available:: " + array.length );

        // Get the elements //
        for ( int i : array ) {
            System.out.println ( "Value at Index::" + ( ++ctr ) + " - " + i );
        }
    }

    /**
     * @return
     * @throws java.util.NoSuchElementException
     */
    public int[] getArrayItems ( ) {
        // First of all prepare given number of locations to store the integer array //
        setIntSomeArray ( new int[ getIntIndexCtr ( ) ] );

        // Take user input //
        System.out.println ( "Number of Indexes Available :: " + getIntIndexCtr ( ) );
        System.out.println ( "Start input for Array" );

        for ( int i = 0; i < intIndexCtr; i++ )
            intSomeArray[ i ] = ConsoleIO._GET_INPUT_.nextInt ( );
        System.out.println ( "All index positions filled!" );
        return getIntSomeArray ( );
    }

    /**
     * \ Generate array data with random numbers of given index size.
     *
     * @param index
     *
     * @return
     */
    public int[] getArrayItems ( int index ) {
        // First of all prepare given number of locations to store the integer array //
        setIntSomeArray ( new int[ index ] );

        for ( int i = 0; i < index; i++ ) {
            intSomeArray[ i ] = ( int ) ( Math.random ( ) * 9 ) + 1;
        }
        return getIntSomeArray ( );
    }

    /**
     * @param array
     * @return
     */
    public float getArrayValueAverage ( int[] array ) {
        int sum = 0;

        for ( int i : array )
            sum += i;

        return ( float ) sum / array.length;
    }

    /**
     * @return the intIndexCtr
     */
    public int getIntIndexCtr ( ) {
        return intIndexCtr;
    }

    /**
     * @return the intOnesnumeralsArray
     */
    public int[] getIntOnesnumeralsArray ( ) {
        return intOnesnumeralsArray;
    }

    /**
     * @return the intOOnesnumeralsArray
     */
    public int[] getIntOOnesnumeralsArray ( ) {
        return intOOnesnumeralsArray;
    }

    /**
     * @return the intSomeArray
     */
    public int[] getIntSomeArray ( ) {
        return intSomeArray;
    }

    /**
     * @param intIndexCtr
     *            the intIndexCtr to set
     */
    public void setIntIndexCtr ( int intIndexCtr ) {
        this.intIndexCtr = intIndexCtr;
    }

    /**
     * @param intOnesnumeralsArray
     *            the intOnesnumeralsArray to set
     */
    public void setIntOnesnumeralsArray ( int[] intOnesnumeralsArray ) {
        this.intOnesnumeralsArray = intOnesnumeralsArray;
    }

    /**
     * @param intOOnesnumeralsArray
     *            the intOOnesnumeralsArray to set
     */
    public void setIntOOnesnumeralsArray ( int[] intOOnesnumeralsArray ) {
        this.intOOnesnumeralsArray = intOOnesnumeralsArray;
    }

    /**
     * @param intSomeArray
     *            the intSomeArray to set
     */
    public void setIntSomeArray ( int[] intSomeArray ) {
        this.intSomeArray = intSomeArray;
    }

}
