/*
 * ===================================================================================
 * FILE-NAME: ResizingArrays.java
 * -----------------------------------------------------------------------------------
 * FQN-ID: com.app.sa.datatypes.ResizingArrays
 * -----------------------------------------------------------------------------------
 * DESCRIPTION:
 * -----------------------------------------------------------------------------------
 * CHANGELOG:
 * 1. File created on 21-01-2019, 20:40 for GettingStartedWithJavaBasics.
 * -----------------------------------------------------------------------------------
 * Copyright @ 2019, iHSPA
 * ===================================================================================
 */
package com.app.xio.core.datatypes;

import com.app.xio.console.conso.ConsoleIO;
import com.app.xio.console.conso.Messages;

/**
 * Class description goes here.
 *
 * @author
 */
public class ResizingArrays {

    private int index;
    private int[] originalArray;
    private int[] tempArray;

    private Messages iMessages = new Messages ( );

    /* Class Constructor */
    public ResizingArrays ( ) {
        index = 0;
        originalArray = new int[ 0 ];
        tempArray = new int[ 0 ];
    }

    /**
     * @param index
     */
    public ResizingArrays ( int index ) {
        this ( );
        originalArray = new int[ index ];

    }

    public int getIndex ( ) {
        return index;
    }

    public void setIndex ( int index ) {
        if ( index != 0 )
            this.index = index;
    }

    public int[] getOriginalArray ( ) {
        return originalArray;
    }

    public void setOriginalArray ( int[] originalArray ) {
        this.originalArray = originalArray;
    }

    public int[] getTempArray ( ) {
        return tempArray;
    }

    public void setTempArray ( int[] tempArray ) {
        this.tempArray = tempArray;
    }

    /**
     *
     */
    public void getArrayValues ( ) {
        if ( index != 0 ) {
            originalArray = new int[ index ];

            System.out.println ( "Total Required Values :" + index );
            for ( int i = 0; i < index; i++ ) {
                System.out.println ( "For Index Position " + i );
                originalArray[ i ] = ConsoleIO._GET_INPUT_.nextInt ( );
            }
        }
    }

    /**
     *
     */
    public void doDisplayArray ( ) {
        int ctr = 1;

        System.out.println ( iMessages.formatMessage ( "originalArray", 2, "TOTAL" ) );

        for ( int i : originalArray ) {
            System.out.println ( "VALUE AT " + ctr++ + "::" + i );
        }
    }

    /**
     * @param newIndex
     */
    public void resizeArray ( int newIndex ) {

        // Set the appropriate new count of index for later use //
        if ( newIndex <= getIndex ( ) ) {
            System.out.println ( iMessages.formatMessage ( "index", 0, "STINP" ) );
        } else {
            setIndex ( newIndex );
            System.out.println ( iMessages.formatMessage ( "originalArray", 2, "AFTER" ) );

            tempArray = originalArray;
            originalArray = new int[ newIndex ];

            for ( int i = 0; i < tempArray.length; i++ ) {
                originalArray[ i ] = tempArray[ i ];
            }

            System.out.println ( iMessages.formatMessage ( "originalArray", 2, "INITVAL" ) );
            doDisplayArray ( );
        }
    }

}