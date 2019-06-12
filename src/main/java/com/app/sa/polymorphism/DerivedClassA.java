/**
 * 
 */
package com.app.sa.polymorphism;

/**
 * @author COM
 */
public class DerivedClassA extends BaseClassInfo { // Consider this class as Lamborghini //

    /**
     * 
     */
    public DerivedClassA ( ) {
        System.out.println ( "DerivedClasA::Lamborghini::Instantiated" );
    }

    /**
     * @param name
     * @param engine
     * @param cylinders
     * @param gates
     */
    public DerivedClassA ( String name, String engine, short cylinders, short gates ) {
        super ( name, engine, ( short ) cylinders, ( short ) gates );
    }

    @Override
    public String doAccelarate ( ) {
        return "Lamborghini Accelaration Started !!";
    }

    @Override
    public String doStartEngine ( ) {
        return "Laborghini engine started";
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString ( ) {
        return "DerivedClassA [doAccelarate()=" + doAccelarate ( ) + ", doStartEngine()=" + doStartEngine ( )
                + ", getName()=" + getName ( ) + ", getEngine()=" + getEngine ( ) + ", getCylinders()="
                + getCylinders ( ) + ", getGates()=" + getGates ( ) + "]";
    }

}
