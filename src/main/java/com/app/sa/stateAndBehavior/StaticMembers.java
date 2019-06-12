/*
 * =========================================================
 * FILE-NAME: StaticMembers.java
 * ---------------------------------------------------------
 * FQN ID: com.app.sa.stateAndBehavior.StaticMembers.java
 * ---------------------------------------------------------
 * DESCRIPTION: Demonstration of Static Members
 * CHANGELOG:
 * ---------------------------------------------------------
 * Date | Version | Editor | Remarks
 * ---------------------------------------------------------
 * 2019-01-06 | 0.1 | iHSPA | File Created
 * ---------------------------------------------------------
 * Copyright @ 2019, Harsh Shekhar Poddar
 * =========================================================
 */

package com.app.sa.stateAndBehavior;

/**
 * @author COM
 */
public class StaticMembers {

    /*
     * =====================================================
     * CODING-GUIDELINES :: STATIC MEMBERS
     * =====================================================
     * Static data members have single copy in the memory
     * and hence shared across all the
     * the classes. This means, any change in the value in
     * one class reflects in other
     * classes as well.
     * -----------------------------------------------------
     * Static methods are used to access static variables.
     * In other words, if there is any
     * opportunity to not user "Instance" variables, we can
     * use static methods.
     * -----------------------------------------------------
     * There are certain rules to be followed when using
     * static members:
     * 1. Static methods can only call other static methods.
     * 2. Static methods can only access static data members
     * 3. Static members are directly accessible using
     * convention
     * "ClassName.StaticMemberName"
     * They do not require instance of the class.
     * 4. Static methods cannot call this() or super()
     * =====================================================
     */

    public String strMsg = "Some Random String Sequence";

    private static short shClassCounter = 0;

    /**
     * 
     */
    public final static void getClassCounter ( ) {
        System.out.println (
                "Number of Classes Instantiated::"
                        + shClassCounter );
        // this.toString ( ); // Using this statement causes
        // compiler error //
        // System.out.println ( strMsg ); // Non-static
        // member cannot be accessed in static method //
    }

    /**
     * 
     */
    public final static void doIncrClassCounter ( ) {
        System.out
                .println ( "Class Counter Incremented at::"
                        + ( ++shClassCounter ) );
        // toString ( ); // Static member cannot access
        // non-static methods //
    }

    public static void main ( String[] args ) {
        // Using Static Nested Class //
        StaticMembers.StaticClass ic = new StaticClass ( );
        ic.print ( );
    }

    /**
     * 
     */
    @Override
    public String toString ( ) {
        return "StaticMembers [getClass()=" + getClass ( )
                + ", hashCode()=" + hashCode ( )
                + ", toString()=" + super.toString ( )
                + "]";
    }

    private static int x = 20;

    /**
     * Classes can be defined as static only if it is an
     * inner class. Use of such class is just limited to the
     * class in which is contained only, hence no point of
     * defining a separate concrete class. Also, this class
     * can be accessed by the instance name of the enclosing
     * class. Example of such class in Java Standard Library
     * is Entry class in Map. It's usage is only limited to
     * the Map class itself hence no point of declaring a
     * separate one.
     * 
     * @author ihspa
     */
    static class StaticClass {

        int x = 10;

        private void print ( ) {
            System.out.println ( x );
            /*
             * Since this is a Static class, all members
             * inside it are all static. If following x is
             * not been defined as static in enclosing class
             * then there would be an error for accessing a
             * non-static member in a static class.
             */
            System.out.println ( StaticMembers.x );
        }
    }
}
