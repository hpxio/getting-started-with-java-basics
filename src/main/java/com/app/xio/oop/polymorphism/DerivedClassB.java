/**
 * 
 */
package com.app.xio.oop.polymorphism;

/**
 * @author COM
 */
public class DerivedClassB extends BaseClassInfo { // Consider this class as Mercedes //

    /**
     * 
     */
    public DerivedClassB ( ) {
        System.out.println ( "DerivedClasA::Mercedes::Instantiated" );
    }

    /**
     * @param name
     * @param engine
     * @param cylinders
     * @param gates
     */
    public DerivedClassB ( String name, String engine, short cylinders, short gates ) {
        super ( name, engine, ( short ) cylinders, ( short ) gates );
    }

    @Override
    public String doAccelarate ( ) {
        return "Mercedes Accelaration Started !!";
    }

    @Override
    public String doStartEngine ( ) {
        return "Mercedes engine started";
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString ( ) {
        return "DerivedClassB [doAccelarate()=" + doAccelarate ( ) + ", doStartEngine()=" + doStartEngine ( )
                + ", getName()=" + getName ( ) + ", getEngine()=" + getEngine ( ) + ", getCylinders()="
                + getCylinders ( ) + ", getGates()=" + getGates ( ) + "]";
    }

}
