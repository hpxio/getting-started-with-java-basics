/*
 * ===================================================================================
 * FILE-NAME: ValuePassing.java
 * -----------------------------------------------------------------------------------
 * FQN-ID: com.app.sa.datatypes.ValuePassing
 * -----------------------------------------------------------------------------------
 * DESCRIPTION: Demonstration of differences in Value & Reference types.
 * -----------------------------------------------------------------------------------
 * CHANGELOG:
 * 1. File Created. Value type example added.
 * 2. File header added.
 * -----------------------------------------------------------------------------------
 * Copyright @ 2019, Harsh Shekhar Poddar
 * ===================================================================================
 */
package com.app.sa.datatypes;

import com.app.sa.conso.Messages;

import java.util.Arrays;

/**
 *
 */
public class ValuePassing {

    // For error messages //
    Messages iMessages = new Messages ( );

    /*
     * ===================================================================================
     * CODING-GUIDELINES :: Value Types & Reference Types
     * ===================================================================================
     * Difference Between Value and References: Value - The Data Itself | Reference - The
     * Address of the Memory holding that value
     * ===================================================================================
     */

    // Primitive Types are always "Value types". Meaning they are always copied to new locations //
    private int someVal = 10;
    private int anotherVal = someVal;

    // Derived Types are always "Reference types". Meaning they are always referenced to in new locations //
    private int someArr[] = new int[ 3 ];
    private int anotherArr[] = someArr;

    /**
     *
     */
    public ValuePassing ( ) {
        // Initializing array types //
        someArr[ 0 ] = 45;
        someArr[ 1 ] = 21;
        someArr[ 2 ] = 90;
        /*
         This is not correct method of initializing arrays but for sake of brevity we are using it in this format.
         */
    }

    public int getSomeVal ( ) {
        return someVal;
    }

    public void setSomeVal ( int someVal ) {
        this.someVal = someVal;
    }

    public int getAnotherVal ( ) {
        return anotherVal;
    }

    public void setAnotherVal ( int anotherVal ) {
        this.anotherVal = anotherVal;
    }

    public int[] getSomeArr ( ) {
        return someArr;
    }

    public void setSomeArr ( int[] someArr ) {
        this.someArr = someArr;
    }

    public int[] getAnotherArr ( ) {
        return anotherArr;
    }

    public void setAnotherArr ( int[] anotherArr ) {
        this.anotherArr = anotherArr;
    }

    /**
     * @return
     */
    @Override public String toString ( ) {
        return "ValuePassing{" + "someVal=" + someVal + ", anotherVal=" + anotherVal + ", someArr=" + Arrays
                .toString ( someArr ) + ", anotherArr=" + Arrays.toString ( anotherArr ) + '}';
    }

    /**
     * @param arr
     */
    private void displayArrayValue ( int[] arr ) {
        for ( int i : arr )
            System.out.println ( i );
    }

    /**
     *
     */
    public void getValRefDemo ( ) {

        System.out.println ( "Value Types Example" );
        System.out.println ( "---------------------------------------------------" );
        System.out.println ( "Before Changes" );
        System.out.println ( "someVal:: " + getSomeVal ( ) );
        System.out.println ( "anotherVal:: " + getAnotherVal ( ) );

        // Changing the value in anotherVal //
        setAnotherVal ( 98 );

        System.out.println ( "After Changes" );
        System.out.println ( "someVal::" + getSomeVal ( ) );
        System.out.println ( "anotherVal::" + getAnotherVal ( ) );
        System.out.println ( "---------------------------------------------------" );

        System.out.println ( "Reference Types Example" );
        System.out.println ( "---------------------------------------------------" );
        System.out.println ( "Before Changes" );
        System.out.println ( "someArr::Values" );
        displayArrayValue ( someArr );

        System.out.println ( "anotherArr::Values" );
        displayArrayValue ( anotherArr );

        // Call method to change the array values //
        // doModifyArrayVals ( someArr );
        doModifyArrayVals ( someArr, 2 );

        System.out.println ( "After Changes" );
        System.out.println ( "getSomeArr" );
        displayArrayValue ( someArr );

        System.out.println ( "getAnotherArr" );
        displayArrayValue ( anotherArr );
        System.out.println ( "---------------------------------------------------" );
    }

    /**
     * @param arr
     */
    private void doModifyArrayVals ( int[] arr ) {

        arr[ 2 ] = 100;
        arr[ 1 ] = 1;
    }

    /**
     * Changes ctr number of values from first index with random numbers.
     *
     * @param arr
     * @param ctr
     */
    private void doModifyArrayVals ( int[] arr, int ctr ) {

        // De-Referencing of Passed Argument //
        arr = new int[]{ 1, 23, 4, 5, 78 };

        /*
        Above statement will have no effect on the original passed
        array because now arr holds new array.
         */

        if ( ctr < arr.length ) {
            for ( int i = 0; i < ctr; i++ ) {
                arr[ i ] = ( int ) ( Math.random ( ) * 90 ) + 1;
            }
        } else {
            // Calling error message descriptor uniformly //
            System.out.println ( iMessages.get_ERROR_MSGS_ ( ).get ( "INP" ) );
        }
    }
}
