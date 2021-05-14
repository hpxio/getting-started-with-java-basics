/**
 * 
 */
package com.app.xio.oop.inheritance.composition;

/**
 * This class carries both "is a" and "has a" relation.
 */
public class SubComponentC extends SubComponentCSuper {

    // Gaming or Compact //
    private String compatibility;

    public SubComponentC ( ) {
        System.out.println ( "SubComponentC::Cabinet-Class-Instantiated" );
    }

    /**
     * @param name
     * @param model
     * @param height
     * @param width
     * @param length
     * @param compatibility
     */
    public SubComponentC ( String name, String model, byte height, byte width, byte length, String compatibility ) {
        super ( name, model, height, width, length );
        this.compatibility = compatibility;
    }

    /**
     * @return the compatibility
     */
    public String getCompatibility ( ) {
        return compatibility;
    }

    /**
     * @param compatibility
     *            the compatibility to set
     */
    public void setCompatibility ( String compatibility ) {
        this.compatibility = compatibility;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString ( ) {
        return "SubComponentC [compatibility=" + compatibility + ", getCompatibility()=" + getCompatibility ( )
                + ", getName()=" + getName ( ) + ", getModel()=" + getModel ( ) + ", getHeight()=" + getHeight ( )
                + ", getWidht()=" + getWidht ( ) + ", getLength()=" + getLength ( ) + "]";
    }

}
