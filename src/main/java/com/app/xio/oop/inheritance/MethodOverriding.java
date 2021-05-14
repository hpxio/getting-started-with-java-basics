/**
 * 
 */

package com.app.xio.oop.inheritance;

/**
 * Overriding is sort of runtime polymorphism.
 * Rules to establish Overriding
 * Method Signature should be same as per the overridden
 * method.
 * Modifier type cannot be more restrictive type. Like, if
 * method has protected modifier in super class then derived
 * class cannot change it to private.
 * Return type can be co-variant of the type defined in
 * super class.
 * The exception handler cannot be more open/broader than
 * the one declared in the super class. Like, if the super
 * class declares exception condition as ArithmaticException
 * then derived class cannot have it RunTimeException.
 * 
 * @author COM
 */
public class MethodOverriding extends Super
        implements
            ISuper {

    @Override
    public void print ( ) {
        System.out.println ( "Derived:print()" );
    }

    public static void main ( String[] args ) {
        MethodOverriding m = new MethodOverriding ( );
        m.print ( );
    }
}


class Super {

    public void print ( ) {
        System.out.println ( "Super::print()" );
    }
}


interface ISuper {

    // Simple pre-J8 specification //
    public void print ( );
}
