/**
 * 
 */
package com.app.sa.javaGenerics;

import java.util.ArrayList;

/**
 * @author COM
 */
public class GenericArraylistDemo {

    // Wrong way of using generic, since it is a raw type and any non-type safe data can be given //
    // private ArrayList iSimpleArrayList = new ArrayList ( );

    // Right way of using generic, since it is Integer type and only Integer data can be given //
    private ArrayList< Integer > iIntegerArrayList = new ArrayList<> ( );

    /**
     * 
     */
    public GenericArraylistDemo ( ) {
        /*
         * Any kind of data is allowed which is wrong and can create problem when any calculation is applied, like
         * adding +2 to each entry, etc. Pay attention to the error messages.
         */
        // this.iSimpleArrayList.add ( 1 );
        // this.iSimpleArrayList.add ( "String" );
        // this.iSimpleArrayList.add ( 20.1D );
        // this.iSimpleArrayList.add ( 3.14F );
        // Above data access or operation might cause only run-time error and is difficult to find if project magnitude
        // is large //

        /*
         * Only Integer type input allowed for templated generic
         */
        this.iIntegerArrayList.add ( 1 );
        // this.iIntegerArrayList.add ( 1.3F); // This statement will create compile time error //
        this.iIntegerArrayList.add ( 2987 );
        this.iIntegerArrayList.add ( 33409808 );

    }

    /**
     * @param list
     */
    private void getIntegerArrayList ( ArrayList< Integer > list ) {
        // Totally safe to apply any operation uniformly //
        for ( Integer i : list ) {
            System.out.println ( i );
        }
    }

    /**
     * @param list
     */
    /*
     * private void getSimpleArrayList ( ArrayList list ) {
     * // Hazardous and un-ethical to apply any operation uniformly //
     * for ( Object o : list ) {
     * System.out.println ( ( Integer ) o );
     * }
     * // Above code will compile correctly but will cause a run-time error //
     * }
     */

    /**
     * 
     */
    public void doStartDemo ( ) {
        // System.out.println ( "You might need to comment the following code!!" );
        // this.getSimpleArrayList ( this.iSimpleArrayList );
        System.out.println ( "The good way to demo Generics!!" );
        this.getIntegerArrayList ( this.iIntegerArrayList );
    }
}
