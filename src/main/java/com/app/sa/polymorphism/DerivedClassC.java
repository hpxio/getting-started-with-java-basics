/**
 * 
 */
package com.app.sa.polymorphism;

/**
 * @author COM
 */
public class DerivedClassC extends BaseClassInfo { // Consider this class as BMW //

    /**
     * 
     */
    public DerivedClassC ( ) {
        System.out.println ( "DerivedClasA::BMW::Instantiated" );
    }

    /**
     * @param name
     * @param engine
     * @param cylinders
     * @param gates
     */
    public DerivedClassC ( String name, String engine, short cylinders, short gates ) {
        super ( name, engine, ( short ) cylinders, ( short ) gates );
    }

    @Override
    public String doAccelarate ( ) {
        return "BMW Accelaration Started !!";
    }

    // Purposely leaving the implementation just to see the effects of Polymorphism //
    /*
     * @Override
     * public String doStartEngine ( ) {
     * return "BMW engine started";
     * }
     */

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString ( ) {
        return "DerivedClassC [doAccelarate()=" + doAccelarate ( ) + ", getName()=" + getName ( ) + ", getEngine()="
                + getEngine ( ) + ", getCylinders()=" + getCylinders ( ) + ", getGates()=" + getGates ( )
                + ", doStartEngine()=" + doStartEngine ( ) + "]";
    }

}
